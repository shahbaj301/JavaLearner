import java.util.*;

class Main {
    public static void main(String[] args) {

        int PIN = 12456;
        int availableamount = 10000;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the user PIN: ");
        int userpin = sc.nextInt();

        if (PIN == userpin) {

            System.out.print("Enter the amount to withdraw: ");
            int amount = sc.nextInt();

            if (amount > 0 && amount <= availableamount) {
                availableamount = availableamount - amount;
                System.out.println("Withdrawal Successful");
                System.out.println("Remaining amount is: " + availableamount);
            } 
            else {
                System.out.println("Insufficient Balance");
            }

        } 
        else {
            System.out.println("Invalid PIN");
        }
        
    }
}