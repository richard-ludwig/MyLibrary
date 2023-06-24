package MyClasses;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Richard Ludwig
 * @version 2.0
 *
 * <h2>Classe com métodos de manipulação de arquivos e pastas.</h2>
 */
public class MyArchive {
    private static Scanner scan;
    private static PrintWriter pw;
    private static FileReader fr;
    private static FileWriter fw;
    private static BufferedReader br;
    private static BufferedWriter bw;

    public static File create(String name, String extension, String directory){
        File dir;
        if(directory.equals("home")){
            dir = new File("user.home");
        }
        else if (directory.equals("app")) {
            dir = new File("user.dir");
        }
        else {
            dir = new File(directory);
        }
        if(!dir.exists()){
            dir.mkdir();
        }
        File f = new File(dir, name+extension);
        if (!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return f;
    }
    public static File create(String name, String extension){
        String dirApp = System.getProperty("user.dir");
        return create(name, extension, dirApp);
    }
    public static File create(String name){
        return create(name, ".txt");
    }
    public static void writeBW(String text, File archive, boolean keepPreviousData){
        try {
            fw = new FileWriter(archive, keepPreviousData);
            bw = new BufferedWriter(fw);
            bw.write(text);
            bw.close();
            fw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void writeBW(ArrayList<String> text, File archive, boolean keepPreviousData){
        try {
            fw = new FileWriter(archive, keepPreviousData);
            bw = new BufferedWriter(fw);
            for (String element: text) {
                bw.write(element);
            }
            bw.close();
            fw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void writePW(String text, File archive){
        try {
            pw = new PrintWriter(archive);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        pw.write(text);
        pw.close();
    }
    public static void writePW(ArrayList<String> text, File archive){
        try {
            pw = new PrintWriter(archive);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (String element: text) {
            pw.write(element);
        }
        pw.close();
    }
    public static ArrayList<String> readS(File archive){
        try {
            scan = new Scanner(archive);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> text = new ArrayList<>();
        while (scan.hasNextLine()){
            text.add(scan.nextLine());
        }
        scan.close();
        return text;
    }
    public static ArrayList<String> readBR(File archive){
        ArrayList<String> text = new ArrayList<>();
        try {
            fr = new FileReader(archive);
            br = new BufferedReader(fr);
            try {
                String line = br.readLine();
                while(line!=null){
                    text.add(line);
                    line= br.readLine();
                }
                fr.close();
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return text;
    }
    public static File getFile(String pathname){
        return new File(System.getProperty("user.dir")+pathname);
    }
    public static File getFile(Path path){
        return path.toFile();
    }
    public static ArrayList<ArrayList<String>> getCSV(File fileCSV, boolean hasTitle, String contentSeparator, boolean removeTitle){
        return new MyCSV(fileCSV, hasTitle, contentSeparator).toBidimensionalArrayList(removeTitle);
    }
}