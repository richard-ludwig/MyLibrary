package MyClasses;

import MyGUIComponents.*;
import javax.swing.*;
import java.awt.*;

/**
 * @author Richard Ludwig
 * @version 1.0
 * Classe com métodos de manipulação de elementos de interface(GUI)
 */
public class MyGUI {
    private Icon i;
    private GraphicsDevice device;
    private MyFrame frame;
    private MyDoublyLinkedList<JPanel> panels;
    public MyGUI(int theme){
        MyTheme t = new MyTheme(theme);
        frame=new MyFrame();
        panels = new MyDoublyLinkedList<>();
        addPanel(t);
    }
    public Dimension getScreenSize(){
       return Toolkit.getDefaultToolkit().getScreenSize();
    }

    /**
     * <h2>Frame</h2>
     */

    public MyFrame createFrame(String headText){
        return createFrame(headText, new MyTheme(0));
    }
    public MyFrame createFrame(String headText, MyTheme t){
        frame = new MyFrame(headText);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(getScreenSize());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        return frame;
    }

    /**
     * <h2>Panels</h2>
     */

    public MyPanel addPanel(MyTheme t, MyBounds b){

        panel.setBackground(Color.GRAY);
        panel.setVisible(true);
        panel.setSize(getScreenSize());
        panel.setLocation(b.local);
        panels.add(panel);
        return panel;
    }
    public MyPanel addPrincipalPanel(MyTheme t){
        MyPanel panel = new MyPanel();
        panel.setBackground(Color.GRAY);
        panel.setVisible(true);
        panel.setSize(getScreenSize());
        panel.setLocation(0,0);
        panels.add(panel);
        return panel;
    }
    public void nextPanel(){

    }
    public void previousPanel(){

    }

    /**
     *<h2>Buttons</h2>
     */

    public MyButton newButton(JPanel p){
        return newButton("Button", p);
    }
    public MyButton newButton(String text, JPanel p){
        MyTheme t = new MyTheme(0);
        JButton btn = new JButton();
        btn.setText(text);
        btn.setBorder(new MyBorders(50,t.borderColor ));
        MyBounds b = new MyBounds(25,25);
        btn.setSize(b.size);
        btn.setLocation(b.local);
        btn.setForeground(t.fontColor);
        btn.setBackground(t.backgroundColor);
        btn.setFont(t.font);
        btn.setBorder(t.border);
        return btn;
    }
    public JButton newButton(String text, MyBounds b){
        MyTheme t = new MyTheme(0);
        JButton btn = new JButton();
        btn.setText(text);
        btn.setBorder(new MyBorders(50, t.borderColor));
        btn.setSize(b.size);
        btn.setLocation(b.local);
        btn.setForeground(t.fontColor);
        btn.setBackground(t.backgroundColor);
        btn.setFont(t.font);
        btn.setBorder(t.border);
        return btn;
    }
    public JButton newButton(String text, MyBounds b, MyTheme t){
        JButton btn = newButton(text, b);
        btn.setForeground(t.fontColor);
        btn.setBackground(t.backgroundColor);
        btn.setFont(t.font);
        btn.setBorder(t.border);
        btn.setVisible(true);
        btn.setEnabled(true);
        return btn;
    }
    public JButton newButton(String text, MyBounds b, MyTheme t, Icon i){
        JButton btn = newButton(text, b, t);
        btn.setIcon(i);
        return btn;
    }
    public void stop(){
        frame.setVisible(false);
        frame.removeAll();
        System.exit(0);
    }
    public void start(){

    }
}
