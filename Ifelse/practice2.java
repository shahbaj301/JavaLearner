import java.util.*;
public class practice2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of hours:");
		int hours=sc.nextInt();
		if(hours>0){
		    if(hours<=2){
		        System.out.println("Parking fee is ₹30.");
		        
		        
		    }
		    else if(hours>=3 && hours<=5){
		        System.out.println("Parking fee is ₹50.");
		        
		    }
		    else if(hours>=6 && hours<=10){
		        System.out.println("Parking fee is ₹80");
		        
		    }
		    else if(hours>=10){
		        System.out.println("Parking fee is ₹120.");
		        
		    }
		}
		else{
		    System.out.println("Invalid hours");
		    
		}
	}
}