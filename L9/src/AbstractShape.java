import TurtleGraphics.Pen;

    abstract public class AbstractShape implements Shape{
            
            protected double xPos, yPos;
            
            public AbstractShape(){
                xPos=0;
                yPos=0;
            }
            
            public AbstractShape(double x, double y){
                xPos = x;
                yPos = y;
            }
            
  
    //abstract methods - cant be defined here
    //must be defined in child classes 
    abstract public double area();
    abstract public void draw(Pen p);
    abstract public void stretchBy(double fact);

    //final methods - opposite of abstract 
    //cant be defined or modified in child classes 
    public final double getXPos(){
        return xPos;
}
    public final double getYPos(){
        return yPos;
}
    public void move(double xLoc, double yLoc){
        xPos = xLoc;
        yPos = yLoc;
}
    //neither abstract or final
    //child classes have permission to over-ride or extend this
    public String toString(){
        String str = "X-Y Position= " + xPos + ", " + yPos;
        str += "\nArea= " + area();
        return str;
}
}