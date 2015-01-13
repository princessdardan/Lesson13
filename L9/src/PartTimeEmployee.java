
public class PartTimeEmployee extends Employee{
    
    public PartTimeEmployee(){
        super();
    }
    
    public double getPay(){
        double pemppay = hours * rate;
        totalPay += pemppay;
        return pemppay;
    }
    
}