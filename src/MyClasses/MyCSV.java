package MyClasses;

import java.io.File;
import java.util.ArrayList;

public class MyCSV {
    private ArrayList<String> title;
    private ArrayList<ArrayList<String>> data;
    private String contentSeparator;
    private boolean hasTitle = true;
    public MyCSV(File fileCSV, boolean hasTitle, String contentSeparator){
        this.hasTitle=hasTitle;
        this.contentSeparator=contentSeparator;
        this.data=new ArrayList<>();
        fromCSV(fileCSV,contentSeparator);
    }
    public String getDataCell(int line, int column){
        return data.get(line).get(column);
    }
    public ArrayList<String> getDataLine(int i){
        return data.get(i);
    }
    public ArrayList<ArrayList<String>> getData(){
        return data;
    }
    public ArrayList<String> getTitle(){
        return title;
    }
    public String getTitleCell(int column){
        return title.get(column);
    }
    private void fromCSV(File file, String contentSeparator){
        ArrayList<String> lines = MyArchive.readBR(file);
        int c = 0;
        if(this.hasTitle){
            this.title=new ArrayList<>();
            String titleLine = lines.get(c);
            for (String element : titleLine.split(contentSeparator)) {
                title.add(element);
            }
            c++;
        }
        ArrayList<String> n;
        while(c<lines.size()) {
            n = new ArrayList<>();
            for(String e : lines.get(c).split(contentSeparator)){
                n.add(e);
            }
            data.add(n);
            c++;
        }
    }
    public ArrayList<ArrayList<String>> toBidimensionalArrayList(boolean removeTitle){
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        if (hasTitle && !removeTitle) {
            result.add(title);
        }
        for (ArrayList<String> e : data) {
            result.add(e);
        }
        return result;
    }
}