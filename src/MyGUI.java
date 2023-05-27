import javax.swing.*;
import java.awt.*;
/**
 * @author Richard Ludwig
 * @version 1.0
 * Classe com métodos de manipulação de elementos de interface(GUI)
 */
public class MyGUI {

    private JPanel panel;
    private GraphicsDevice device;
    public MyGUI(){
        panel=new JPanel();
    }
    private Dimension getScreenSize(){
       return Toolkit.getDefaultToolkit().getScreenSize();
    }
    public JPanel
    public JFrame createFrame(String headText, int defaultTheme){
//        switch (defaultTheme){
//            case 1:;
//            case 2:;
//            case 3:;
//            case 4:;
//            case 5:;
//            case 6:;
//            case 7:;
//            case 8:;
//        }
        JFrame frame = new JFrame(headText);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(getScreenSize());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        return frame;
    }
    public JFrame createFrame(String headText){
        return createFrame(headText, 1);
    }
}
