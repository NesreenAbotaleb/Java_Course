package EX02_07;
import java.util.*;
public class EX02_07 {
    public static void main(String[]args){
    
        System.out.print("Enter the number of minutes : ");
        
        
        Scanner input = new Scanner(System.in);
    long x = input.nextLong();
    
  
    long D = x/(24*60) ;
    long Y = x /(365*60*24);
    
        System.out.println(x +" minutes is approximately "+ Y +" years and "+ D +"days");
    }
}
