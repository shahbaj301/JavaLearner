import java.util.*;
public class Example2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        String ans=(num>0)?"Positive":(num<0)?"Neagtive":"Zero";
        System.out.println("Number is: "+ans);



    }
    
}
