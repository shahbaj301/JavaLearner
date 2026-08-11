//check Palindrome.
import java.util.*;

public class practice8
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the number:");
	    
	    int n=sc.nextInt();
	    int rev=0;
	    int num=n;
	    while(num>0){
	        int rem=num%10;
	        rev=(rev*10)+rem;
	        num=num/10;
	        
	    }
	    //System.out.println("Reverse of a number is:"+rev);
	    
	    if(n==rev){
	        System.out.println(n+" is a Palindrome number.");
	        
	    }
	    else{
	        System.out.println(n+" is not a Palindrome number.");
	        
	    }
	    
	    
	    
	
	}
}