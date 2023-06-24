package MyGUIComponents;

import javax.swing.border.Border;
import java.awt.*;

public class MyTheme {
    public Color fontColor;
    public Font font;
    public Color backgroundColor;
    public Border border;
    public Color borderColor;

    public MyTheme(Color  backgroundColor, Color fontColor, int borderRadius, Font font, Color borderColor){
        this.backgroundColor=backgroundColor;
        this.fontColor=fontColor;
        this.border= new MyBorders(borderRadius, borderColor);
        this.font=font;
        this.borderColor=borderColor;
    }
    public MyTheme(int choose){
        switch (choose){
            case 0:
                this.backgroundColor= new Color(230, 230, 230, 230);
                this.fontColor=new Color(25, 25, 25, 255);
                this.border=new MyBorders(15, borderColor);
                this.font=new Font("Calibri", Font.PLAIN, 20);
                break;
            case 1:
                this.backgroundColor= new Color(230, 230, 230, 230);
                this.fontColor=new Color(25, 25, 25, 255);
                this.border=new MyBorders(15, borderColor);
                this.font=new Font("Calibri", Font.PLAIN, 20);
                break;
            case 2:
                this.backgroundColor= new Color(230, 230, 230, 230);
                this.fontColor=new Color(25, 25, 25, 255);
                this.border=new MyBorders(15, borderColor);
                this.font=new Font("Calibri", Font.PLAIN, 20);
                break;
            case 3:
                this.backgroundColor= new Color(230, 230, 230, 230);
                this.fontColor=new Color(25, 25, 25, 255);
                this.border=new MyBorders(15, borderColor);
                this.font=new Font("Calibri", Font.PLAIN, 20);
                break;
            case 4:
                this.backgroundColor= new Color(230, 230, 230, 230);
                this.fontColor=new Color(25, 25, 25, 255);
                this.border=new MyBorders(15, borderColor);
                this.font=new Font("Calibri", Font.PLAIN, 20);
                break;
            case 5:
                this.backgroundColor= new Color(230, 230, 230, 230);
                this.fontColor=new Color(25, 25, 25, 255);
                this.border=new MyBorders(15, borderColor);
                this.font=new Font("Calibri", Font.PLAIN, 20);
                break;
            case 6:
                this.backgroundColor= new Color(230, 230, 230, 230);
                this.fontColor=new Color(25, 25, 25, 255);
                this.border=new MyBorders(15, borderColor);
                this.font=new Font("Calibri", Font.PLAIN, 20);
                break;
            case 7:
                this.backgroundColor= new Color(230, 230, 230, 230);
                this.fontColor=new Color(25, 25, 25, 255);
                this.border=new MyBorders(15, borderColor);
                this.font=new Font("Calibri", Font.PLAIN, 20);
                break;
            case 8:
                this.backgroundColor= new Color(230, 230, 230, 230);
                this.fontColor=new Color(25, 25, 25, 255);
                this.border=new MyBorders(15, borderColor);
                this.font=new Font("Calibri", Font.PLAIN, 20);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choose);
        }
    }
}
