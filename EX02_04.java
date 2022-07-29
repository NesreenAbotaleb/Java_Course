package EX02_04;
import java.util.Scanner;
public class EX02_04 {
    public static void main(String[]args){
    
        System.out.print("Enter a number in pounds : ");
        
        
        Scanner input = new Scanner(System.in);
    double P =input.nextDouble();
    
    double kg = P*0.454;
        System.out.println(P+" pounds is "+kg+" kilograms");
    }
}
