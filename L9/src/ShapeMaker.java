import TurtleGraphics.*;
import java.awt.Color;
import TerminalIO.KeyboardReader;

public class ShapeMaker {

    public static void main(String[] args) {
       
        
        Pen p = new StandardPen(new SketchPadWindow(400,400));
        Shape s1 = null;
        double r, x, y;
        double h, w;
        int choice;
        KeyboardReader kr = new KeyboardReader();
        
        while(true)
        {
            choice = kr.readInt("Enter 1 for rectangle or 2 for circle: ");
            if(choice == 1 || choice == 2) break;
        }
        if(choice==1)
        {
            h = kr.readDouble("Enter height of rectangle: ");
            w = kr.readDouble("Enter width of rectangle: ");
            s1 = new Rect(0,0,w,h);
        }
        else if(choice==2)
        {
            r = kr.readDouble("Enter radius of circle: ");
            s1 = new Circle(0,0,r);
        }
        
        while(true)
        {
            s1.draw(p);
            x = kr.readDouble("New x: ");
            y = kr.readDouble("New y: ");
            p.setColor(Color.white);
            s1.draw(p);
            s1.move(x,y);
            p.setColor(Color.blue);
            s1.draw(p);
        }
    }
    
}