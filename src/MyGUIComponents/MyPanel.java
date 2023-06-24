package MyGUIComponents;

import javax.swing.*;

public class MyPanel {
    private JPanel panel;
    public MyPanel(MyTheme t, MyBounds b){
        panel = new JPanel();
        panel.setLocation(b.local);
        panel.setSize(b.size);
        panel.setLayout();
        panel.setVisible(true);
    }
    public void addLayout(LayoutStyle layout){

    }

}
