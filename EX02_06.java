package EX02_06;
import java.util.*;
public class EX02_06 {
    public static void main(String[]args){
    
        System.out.print("Enter a number between 0 and 1000 : ");
        
        Scanner input = new Scanner (System.in);
    int x = input.nextInt();
    int y = 0;
    while(x != 0){
    y = y + (x%10);
    x = x/10;
    }
        System.out.println("The sum of the digits is "+y);
    }
}
