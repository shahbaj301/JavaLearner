package ArrayDemo;

import classes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        ArrayOperations obj = new ArrayOperations(size);
        int choice;
        do {
            System.out.println("\n===== ARRAY OPERATIONS =====");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Smallest");
            System.out.println("6. Largest");
            System.out.println("7. Sum");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.insert();
                    break;

                case 2:
                    obj.DisplayElements();
                    break;

                case 3:
                    obj.search();
                    break;

                case 4:
                    obj.update();
                    break;

                case 5:
                    System.out.println("Smallest Element is: " + obj.mini());
                    break;

                case 6:
                    System.out.println("Largest Element is: " + obj.maxi());
                    break;

                case 7:
                    System.out.println("Sum of array is: " + obj.sum());
                    break;

                case 8:
                    System.out.println("Thank you for your time");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 8);
    }

}
