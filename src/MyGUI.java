import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;

/**
 * @author Richard Ludwig
 * @version 1.0
 * Classe com métodos de manipulação de elementos de interface(GUI)
 */
public class MyGUI {

    /**
     * <h2>Set Rounded Borders</h2>
     */
    public static class RoundedBorder implements Border {
        private int radius;
        public RoundedBorder(int radius) {
            this.radius = radius;
        }
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
        }
        public boolean isBorderOpaque() {
            return true;
        }
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }

    /**
     * <h2>Set Bounds</h2>
     */
    public static class Bounds{
        public Dimension size;
        public Point local;
        public Bounds(int width, int height, int x, int y){
            this.size = new Dimension(width,height);
            this.local= new Point(x,y);
        }
        public Bounds(int width, int height){
            this.size = new Dimension(width,height);
            this.local= new Point(0,0);
        }
        public Bounds(Dimension size, Point local){
            this.size = size;
            this.local= local;
        }
    }

    /**
     * <h2>Set Theme</h2>
     */
    public static class Theme{
        public Color fontColor;
        public Font font;
        public Color backgroundColor;
        public RoundedBorder border;

        public Theme(Color  backgroundColor, Color fontColor, RoundedBorder border, Font font){
            this.backgroundColor=backgroundColor;
            this.fontColor=fontColor;
            this.border=border;
            this.font=font;
        }
        public Theme(int choose){
            switch (choose){
                case 0:
                    this.backgroundColor= new Color(230, 230, 230, 230);
                    this.fontColor=new Color(25, 25, 25, 255);
                    this.border=new RoundedBorder(50);
                    this.font=new Font("Calibri", Font.PLAIN, 20);
                    break;
            }
        }
    }
    private GraphicsDevice device;
    private JFrame frame;
    private MyDoublyLinkedList<JPanel> panels;
    public MyGUI(int theme){
        Theme t = new Theme(theme);
        frame=new JFrame();
        panels = new MyDoublyLinkedList<>();
        addPanel(t);
    }

    /**
     *<h2>Get Screen Size</h2>
     */

    private Dimension getScreenSize(){
       return Toolkit.getDefaultToolkit().getScreenSize();
    }

    /**
     * <h2>Frame</h2>
     */

    public JFrame createFrame(String headText){
        return createFrame(headText, new Theme(0));
    }
    public JFrame createFrame(String headText, Theme t){
        frame = new JFrame(headText);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(getScreenSize());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        return frame;
    }

    /**
     * <h2>Panels</h2>
     */

    public JPanel addPanel(Theme t, Bounds b){
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setVisible(true);
        panel.setSize(b.size);
        panel.setLocation(b.local);
        panels.add(panel);
        return panel;
    }
    public JPanel addPanel(Theme t){
        JPanel panel = new JPanel();
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

    public JButton newButton(JPanel p){
        return newButton("Enviar", p);
    }
    public JButton newButton(String text, JPanel p){
        JButton btn = new JButton();
        btn.setText(text);
        btn.setBorder(new RoundedBorder(50));
        Bounds b = new Bounds(25,25);
        btn.setSize(b.size);
        btn.setLocation(b.local);
        Theme t = new Theme(0);
        btn.setForeground(t.fontColor);
        btn.setBackground(t.backgroundColor);
        btn.setFont(t.font);
        btn.setBorder(t.border);
        return btn;
    }
    public JButton newButton(String text, Bounds b){
        JButton btn = new JButton();
        btn.setText(text);
        btn.setBorder(new RoundedBorder(50));
        btn.setSize(b.size);
        btn.setLocation(b.local);
        Theme t = new Theme(0);
        btn.setForeground(t.fontColor);
        btn.setBackground(t.backgroundColor);
        btn.setFont(t.font);
        btn.setBorder(t.border);
        return btn;
    }
    public JButton newButton(String text, Bounds b, Theme t){
        JButton btn = newButton(text, b);
        btn.setForeground(t.fontColor);
        btn.setBackground(t.backgroundColor);
        btn.setFont(t.font);
        btn.setBorder(t.border);
        btn.setVisible(true);
        btn.setEnabled(true);
        return btn;
    }
    public JButton newButton(String text, Bounds b, Theme t, Icon i){
        JButton btn = newButton(text, b, t);
        btn.setIcon(i);
        return btn;
    }
}
