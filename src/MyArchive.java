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
        File f = create(name, extension, dirApp);
        return f;
    }
    public static File create(String name){
        File f = create(name, ".txt");
        return f;
    }
    public static void write(String text, File archive){
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
    public static void write(String text, File archive){
        PrintWriter pw = new PrintWriter(archive);
        pw.write(text);
        pw.close();
    }
    public static void write(String[] text, File archive){
        PrintWriter pw = new PrintWriter(archive);
        for (String element: text) {
            pw.write(element);
        }
        pw.close();
    }
    public static int countLines(File archive){
        scan = new Scanner(archive);
        int count=0;
        while (scan.hasNextLine()){
            count++;
        }
        scan.close();
        return count;
    }
    public static String[] read(File archive){
        scan = new Scanner(archive);
        int count=0;
        String[] text = new String[countLines(archive)];
        while (scan.hasNextLine()){
            text[count]=scan.nextLine();
        }
        scan.close();
        return text;
    }
    public
}
