import java.util.*;

public class Example3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        System.out.print("Enter third number:");
        int c=sc.nextInt();

        String ans=(a>=b && a>=c)?"a is greater":(b>=a && b>=c)?"b is greater":"c is greater";

        System.out.println(ans);

    }
    
}
