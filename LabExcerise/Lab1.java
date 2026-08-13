//package Lab;

import java.util.*;

public class Lab1 {

    Scanner sc = new Scanner(System.in);

    int accountnumber = 12345;
    int PIN = 1245;
    int currentBalance = 10000;

    public boolean checklogin() {

        int attempt = 3;

        while (attempt > 0) {

            System.out.print("Enter the account number: ");
            int acc = sc.nextInt();

            System.out.print("Enter the PIN number: ");
            int pinuser = sc.nextInt();

            if (acc == accountnumber && PIN == pinuser) {
                System.out.println("Login Successfully");
                return true;
            } else {
                attempt--;

                if (attempt > 0) {
                    System.out.println("Attempts Left: " + attempt);
                }
            }
        }

        System.out.println("Your account has been blocked");
        return false;
    }

    // Check Balance
    public void checkbalance() {
        System.out.println("Your current balance is: " + currentBalance);
    }

    // Deposit Money
    public void depositMoney() {

        System.out.print("Enter the amount to be deposit: ");
        int am = sc.nextInt();

        if (am > 0) {
            currentBalance += am;

            System.out.println("Your amount " + am + " is successfully deposited.");
            System.out.println("Your current balance is: " + currentBalance);

        } else {
            System.out.println("Invalid amount. Please enter valid amount.");
        }
    }

    // Withdraw Money
    public void Withdrawamount() {

        System.out.print("Enter the amount to be withdrawn: ");
        int wd = sc.nextInt();

        if (wd <= 0) {
            System.out.println("Please enter valid amount.");

        } else if (wd <= currentBalance) {

            currentBalance = currentBalance - wd;

            System.out.println("Please collect your cash.");
            System.out.println("Your remaining balance is: " + currentBalance);

        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Change PIN
    public void changePin() {

        System.out.print("Enter current PIN: ");
        int currentPin = sc.nextInt();

        if (currentPin == PIN) {

            System.out.print("Enter new PIN: ");
            int newPin = sc.nextInt();

            System.out.print("Confirm new PIN: ");
            int confirmPin = sc.nextInt();

            if (newPin == confirmPin) {
                PIN = newPin;
                System.out.println("PIN changed successfully.");
            } else {
                System.out.println("New PIN and confirmation PIN do not match.");
            }

        } else {
            System.out.println("Incorrect current PIN.");
        }
    }

    // ATM MENU
    public void Atmmain() {

        int choice;

        do {

            System.out.println("\n==============ATM MENU==================");
            System.out.println("1. Check Balance.");
            System.out.println("2. Deposit Money.");
            System.out.println("3. Withdraw Money.");
            System.out.println("4. Change PIN.");
            System.out.println("5. Exit.");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkbalance();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    Withdrawamount();
                    break;

                case 4:
                    changePin();
                    break;

                case 5:
                    System.out.println("\nThank you for using our ATM.");
                    System.out.println("Please collect your card.");
                    System.out.println("Have a nice day!");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    System.out.println("Please select a valid option.");
                    break;
            }

        } while (choice != 5);
    }

    public static void main(String[] args) {

        System.out.println("=============Welcome to ATM============\n");

        Lab1 obj = new Lab1();

        if (obj.checklogin()) {
            obj.Atmmain();
        }
    }
}