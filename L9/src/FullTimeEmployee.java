
public class FullTimeEmployee extends Employee {

    public FullTimeEmployee() {
        super();
    }

    public double getPay() {
        
        double femppay = 0;
        if (hours > 40) {
            femppay += (hours - 40) * (rate * 2);
            femppay += 40 * (rate * 2);
            totalPay += femppay;
            return femppay;
        } 
        else {
            totalPay += hours*rate;
            return hours * rate;
        }
    }
}