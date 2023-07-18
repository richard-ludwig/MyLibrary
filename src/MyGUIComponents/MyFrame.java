package MyGUIComponents;

import MyClasses.MyDoublyLinkedList;
import MyExceptions.EmptyLinkedListException;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    private static GraphicsDevice device;
    private static JFrame frame;
    private MyDoublyLinkedList<JPanel> panels;
    private int actualPanel;
    private Container content;
    public MyFrame(Dimension size, String titleText){
        frame = new JFrame();
        actualPanel=0;
        setFrame(size,titleText);
    }
    public MyFrame(String titleText){
        actualPanel=0;
        frame = new JFrame();
        setFrame(null ,titleText);
    }
    public MyFrame(){
        frame = new JFrame();
        setFrame();
    }
    private void setFrame(Dimension size, String titleText){
        if(size==null){
            frame.setSize(getScreenSize());
        }
        else{
            frame.setSize(size);
        }
        frame.setTitle(titleText);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private void setFrame(){
        setFrame(null, "App");
    }
    private Dimension getScreenSize(){
        return Toolkit.getDefaultToolkit().getScreenSize();
    }
    public void next(){
        panels.get(actualPanel).setVisible(false);
        panels.next().setVisible(true);
        actualPanel++;
    }
    public void previous(){
        panels.get(actualPanel).setVisible(false);
        panels.previous().setVisible(true);
    }
    public void addPanel(MyPanel panel){
        MyPanel p = new MyPanel(new MyTheme(0),  );
    }
    public void removeTitleBar(){
        frame.setUndecorated(true);
    }
}