
package EX02_01;

import java.util.*;

public class EX02_01 {

    
    public static void main(String[] args) {
       System.out.print("Please Enter the degreese by Celsius : ");
        
        Scanner input = new Scanner(System.in);
       int C =input.nextInt();
       
        System.out.println("\n");
       int F=(9/5)*C+32;
      
       System.out.println("The Fahrenheit degreese is : "+F);
       
    }
    
}
