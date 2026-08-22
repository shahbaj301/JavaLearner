//package ArrayDemo;

import java.util.*;

public class Insertionarray {

    int[] arr;
    int size = 0;
    Scanner sc = new Scanner(System.in);

    // Constructor
    public Insertionarray(int capacity) {
        arr = new int[capacity];
    }
    

    // Display
    public void display() {

        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("Array: " + Arrays.toString(Arrays.copyOf(arr, size)));
    }

    // Insertion at beginning
    public void insertatstart() {

        if (size == arr.length) {
            System.out.println("Array is full.");
            return;
        }

        System.out.print("Enter value: ");
        int value = sc.nextInt();

        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = value;
        size++;

        System.out.println("Value inserted at beginning.");
    }

    // Insertion at position
    public void insertatpos() {

        if (size == arr.length) {
            System.out.println("Array is full.");
            return;
        }

        System.out.print("Enter position: ");
        int position = sc.nextInt();

        if (position < 0 || position > size) {
            System.out.println("Invalid position.");
            return;
        }

        System.out.print("Enter value: ");
        int value = sc.nextInt();

        for (int i = size; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position] = value;
        size++;

        System.out.println("Value inserted at position.");
    }

    // Insertion at end
    public void insertEnd() {

        if (size == arr.length) {
            System.out.println("Array is full.");
            return;
        }

        System.out.print("Enter value: ");
        int value = sc.nextInt();

        arr[size] = value;
        size++;

        System.out.println("Value inserted at end.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array capacity: ");
        int capacity = sc.nextInt();

        // Creating object
        Insertionarray obj = new Insertionarray(capacity);

        while (true) {

            System.out.println("\n===== ARRAY MENU =====");
            System.out.println("1. Display");
            System.out.println("2. Insert at Beginning");
            System.out.println("3. Insert at Position");
            System.out.println("4. Insert at End");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    obj.display();
                    break;

                case 2:
                    obj.insertatstart();
                    break;

                case 3:
                    obj.insertatpos();
                    break;

                case 4:
                    obj.insertEnd();
                    break;

                case 5:
                    System.out.println("Program terminated.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}