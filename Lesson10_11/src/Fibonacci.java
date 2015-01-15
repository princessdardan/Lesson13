
import TerminalIO.KeyboardReader;

public class Fibonacci {
    
    public static void main(String[] args){
        KeyboardReader kr = new KeyboardReader();
        int fibnum;
        while(true){
            fibnum = kr.readInt("Which fibonacci number would you like computed(max 15): "); 
            if(fibnum > 15 || fibnum < 0){
                System.out.println("Enter a number between 1 and 15");
            }
            else if(fibnum <=15 && fibnum > 0) break;
        }
        System.out.println("Your fibonacci number is " + fibonacci(fibnum));
    }
    
    static int fibonacci (int n){
        if (n <= 2)
            return 1;
        else
            return fibonacci (n-1) + fibonacci (n-2);
    }
}
