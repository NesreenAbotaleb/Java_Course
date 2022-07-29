package EX02_02;
import java.util.Scanner;
public class EX02_02 {
    public static void main (String[]args){
    
        System.out.print("Enter the radius and length of a cylinder: ");
        
        Scanner input =new Scanner(System.in);
    double r = input.nextDouble();
    double l = input.nextDouble();
    
    double A = r*r*3.14;
    double V = A*l;
    
        System.out.println(" ");
        System.out.println("The area is : "+A);
        System.out.println("The volume is : "+V);
    }
}
