package Loops;
import java.util.Scanner;
//Password checker.
public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;
            boolean hasSpecial = false;

            if (password.length() < 8) {
                System.out.println("Password must be at least 8 characters long.");
            } else {

                for (int i = 0; i < password.length(); i++) {
                    char ch = password.charAt(i);

                    if (ch >= 'A' && ch <= 'Z') {
                        hasUpper = true;
                    } else if (ch >= 'a' && ch <= 'z') {
                        hasLower = true;
                    } else if (ch >= '0' && ch <= '9') {
                        hasDigit = true;
                    } else {
                        hasSpecial = true;
                    }
                }

                if (hasUpper && hasLower && hasDigit && hasSpecial) {
                    System.out.println("Strong Password");
                    return; // Exit program
                } else {
                    if (!hasUpper)
                        System.out.println("Missing uppercase letter.");
                    if (!hasLower)
                        System.out.println("Missing lowercase letter.");
                    if (!hasDigit)
                        System.out.println("Missing digit.");
                    if (!hasSpecial)
                        System.out.println("Missing special character.");
                }
            }

            attempts--;

            if (attempts > 0) {
                System.out.println("Attempts left: " + attempts);
            } else {
                System.out.println("You have used all 3 attempts.");
            }
        }

    }
}