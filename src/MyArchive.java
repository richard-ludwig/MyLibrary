import java.io.*;
import java.util.Scanner;

/**
 * @author Richard Ludwig
 * @version 1.0
 * Classe com métodos de manipulação de arquivos e pastas.
 */
public class MyArchive {
    private static Scanner scan;

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
    public static void writeFW(String text, File archive){
        try {
            FileWriter writer = new FileWriter(archive, true);
            BufferedWriter w = new BufferedWriter(writer);
            w.write(text);
            w.close();
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void writePW(String text, File archive){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(archive);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        pw.write(text);
        pw.close();
    }
    public static void writePW(String[] text, File archive){
        PrintWriter pw;
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
    public static int countLines(File archive){
        try {
            scan = new Scanner(archive);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int count=0;
        while (scan.hasNextLine()){
            count++;
        }
        scan.close();
        return count;
    }
    public static String[] read(File archive){
        try {
            scan = new Scanner(archive);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int count=0;
        String[] text = new String[countLines(archive)];
        while (scan.hasNextLine()){
            text[count]=scan.nextLine();
        }
        scan.close();
        return text;
    }
}
