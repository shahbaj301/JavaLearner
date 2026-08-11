//Count Number of digits
import java.util.*;

public class practice3
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the number:");
	    
	    int n=sc.nextInt();
	    int count=0;
	    while(n>0){
	        count++;
	        n/=10;
	    }
	    System.out.println("Number of digits are:"+count);
	    
	        
	
	}
}