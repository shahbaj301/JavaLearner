import java.util.*;
public class practice3
{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the recharge amount: ");
        int amount = sc.nextInt();

        double discount;

        if (amount >= 200 && amount <= 499) {
            System.out.println("Recharge amount: " + amount);
            discount = amount * 0.05;
            System.out.println("Discount amount: " + discount);

            double remaining = amount - discount;
            System.out.println("Amount to be paid: " + remaining);
        }

        else if (amount >= 500 && amount <= 999) {
            System.out.println("Recharge amount: " + amount);
            discount = amount * 0.10;
            System.out.println("Discount amount: " + discount);

            double remaining = amount - discount;
            System.out.println("Amount to be paid  " + remaining);
        }

        else if (amount >= 1000) {
            System.out.println("Recharge amount: " + amount);
            discount = amount * 0.15;
            System.out.println("Discount amount: " + discount);

            double remaining = amount - discount;
            System.out.println("Amount to be paid: " + remaining);
        }

        else {
            System.out.println("Recharge amount:"+amount);
            discount=0.0;
            System.out.println("Discount amount:"+discount);
            double remaining=amount-discount;
            System.out.println("Amount to be paid:"+remaining);
            
        
            //System.out.println("No discount.");
        }
    }

}