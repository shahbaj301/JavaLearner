import java.util.Scanner;

public class Example {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter salary:");
        double salary=sc.nextDouble();

        System.out.print("Enter Experience:");
        int exp=sc.nextInt();

        System.err.println("Salary:"+salary);
        System.err.println("Experience:"+exp);

        double bonus=exp>=20 ?salary*0.20 :salary*0.10;
        System.out.println("bonus:"+bonus);




    }
    
}
