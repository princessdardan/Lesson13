import TurtleGraphics.Pen;

public class Wheel extends Circle{
    private int numspokes;
    
    public Wheel(){
        super();
        numspokes = 0;
    }
    
    public Wheel(double xLoc, double yLoc, double r, int spk){
        super(xLoc, yLoc, r);
        numspokes = spk;
    }
    
    public void draw(Pen p){
        super.draw(p);
        for(int i = 1;i <= numspokes; i++){
            p.up();
            p.move(xPos, yPos);
            p.setDirection(i * 360/numspokes);
            p.down();
            p.move(radius);
        }
    }
    public String toString(){
        String result = "Wheel\n";
        result += "Radius: " + radius + "\n";
        result += "Spokes: " + numspokes;
        result += "\n" + super.toString();        
        return result;
    }
}
