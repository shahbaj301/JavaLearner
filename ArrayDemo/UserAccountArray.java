package ArrayDemo;
import classes.*;
import java.util.*;

public class UserAccountArray {

    Scanner sc;
    UserAccount users[];
    int top;

    // Constructor
    public UserAccountArray(int size) {
        sc = new Scanner(System.in);
        users = new UserAccount[size];
        top = -1;
    }

    // Create a new user
    public UserAccount createUser() {

        UserAccount user = new UserAccount();

        System.out.println("Enter Account number:");
        user.setAccountno(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter Name:");
        user.setAcname(sc.nextLine());

        System.out.println("Enter Account type:");
        user.setType(sc.nextLine());

        System.out.println("Enter Initial Balance:");
        user.setBalance(sc.nextInt());

        System.out.println("Enter Pin:");
        user.setUserpin(sc.nextInt());

        return user;
    }

    // Add user account
    public void setUserAccount() {

        if (top == users.length - 1) {
            System.out.println("Array is full. Cannot add more users.");
            return;
        }

        users[++top] = createUser();

        System.out.println("User account created successfully.");
    }

    // Search user by account number
    public UserAccount searchUser(int accountno) {

        for (int i = 0; i <= top; i++) {

            if (users[i].getAccountno() == accountno) {
                return users[i];
            }
        }

        return null;
    }

    // Print all users
    public void printAllUsers() {

        if (top == -1) {
            System.out.println("No users found.");
            return;
        }

        for (int i = 0; i <= top; i++) {

            
            System.out.println("Account Number : " + users[i].getAccountno());
            System.out.println("Name           : " + users[i].getAcname());
            System.out.println("Account Type   : " + users[i].getType());
            System.out.println("Balance        : " + users[i].getBalance());
            System.out.println("PIN            : " + users[i].getUserpin());
            
        }
    }

    // Update user details
    public void updateUser(int accountno) {

        UserAccount user = searchUser(accountno);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("\nUser found.");
        System.out.println("Enter new name:");
        sc.nextLine();
        user.setAcname(sc.nextLine());

        System.out.println("Enter new PIN:");
        user.setUserpin(sc.nextInt());

        System.out.println("User details updated successfully.");
    }

    // Menu
    public void menu() {

        int choice;

        do {

            System.out.println("\n===== USER ACCOUNT MENU =====");
            System.out.println("1. Add User");
            System.out.println("2. View User");
            System.out.println("3. View All Users");
            System.out.println("4. Update User Details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    setUserAccount();
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int accountno = sc.nextInt();

                    UserAccount user = searchUser(accountno);

                    if (user != null) {
                        user.displayUser();
                    } else {
                        System.out.println("User not found.");
                    }
                    break;

                case 3:
                    printAllUsers();
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accountno = sc.nextInt();

                    updateUser(accountno);
                    break;

                case 5:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    // Main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of user accounts: ");
        int size = sc.nextInt();

        UserAccountArray ob = new UserAccountArray(size);

        ob.menu();
    }
}