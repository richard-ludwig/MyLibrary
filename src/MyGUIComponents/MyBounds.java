package MyGUIComponents;
import java.awt.*;

public class MyBounds {
    public Dimension size;
    public Point local;
    public MyBounds(int width, int height, int x, int y){
        this.size = new Dimension(width,height);
        this.local= new Point(x,y);
    }
    public MyBounds(int width, int height){
        this.size = new Dimension(width,height);
        this.local= new Point(0,0);
    }
    public MyBounds(Dimension size, Point local){
        this.size = size;
        this.local= local;
    }
}
