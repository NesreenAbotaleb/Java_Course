package EX02_08;
import java.util.*;
public class EX02_08 {
    public static void main (String[]args){
    
        System.out.print("Enter the time zone offset to GMT : ");
        
        
    long TMS = System.currentTimeMillis();//total miliseconds
    
       Scanner input = new Scanner(System.in);
    int GMT = input.nextInt();
    long Y = GMT*60*60*1000;
    long x = Y +TMS;
    
    if(x<0){
    x = TMS - Y;
    }
    
    
    long TS = x/1000;//total seconds
    int CS = (int)(TS%60);//current second
    long TM = TS/60;//total minutes
    int CM = (int) (TM%60);//current minutes
    long TH = TM/60;//total hours
    int CH = (int) (TH%24);//current hour
    
     
   
    
        System.out.println("The current time is "+CH+" : "+CM+" : "+CS);
    }
}
