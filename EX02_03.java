package EX02_03;
import java.util.Scanner;
public class EX02_03 {
    public static void main(String[]args){
    
        System.out.print("Enter a value for feet : ");
        
        
        Scanner input = new Scanner (System.in);
    double x = input.nextDouble(); 
    
    double y = x *0.305;
    
        System.out.println(x+" feet is "+y+" meters");
    }
}
