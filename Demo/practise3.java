import java.util.Scanner;

public class practise3 {
    public static void main(String[] args){
        double pi=3.14;
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Enter the radius");
        int radius=sc.nextInt();

        double area=pi*radius*radius;

        System.out.println("Area of circle is:"+area);
    }   
}
