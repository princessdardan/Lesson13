import TurtleGraphics.Pen;


public class Rect extends AbstractShape{
    
private double  width, height;

    public Rect(){
        super();
        width = 1;
        height = 1;
    }
    

    public Rect (double x, double y, double h, double w){
        super(x,y);
        height = h;
        width = w;
    }
    public double area(){
        return height * width;
    }
    public double perimeter(){
       return width * 2 + height * 2;
    }
    public void draw (Pen p){
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }
    public void stretchBy(double factor){
        height *= factor;
        width *= factor;
    }
    public String toString(){
        String result = "This is a rectangle\n";
        result +="Width = " + width + "\tHeight = " +height;
        result += "\n" + super.toString();
        return result;
    }
}
