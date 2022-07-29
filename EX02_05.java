package EX02_05;
import java.util.*;
public class EX02_05 {
    public static void main (String[]args){
    
        System.out.print("Enter the subtotal and a gratuity rate : ");
        
        
        Scanner input = new Scanner (System.in);
    double S = input.nextDouble();//the subtotal
    double GR = input.nextDouble();// gratuity rate
    
    double G = (GR/100)*S;//The gratuity 
    double T = G+S;//total
    
        System.out.println("The gratuity is $"+G+" and total is $"+T);
    }
}
