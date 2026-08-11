import java.util.*;

public class practice4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int sub3 = sc.nextInt();

        if (sub1 >= 40 && sub2 >= 40 && sub3 >= 40) {

            int total = sub1 + sub2 + sub3;
            double percentage = total / 3.0;

            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage);

            if (percentage >= 90) {
                System.out.println("Grade: A");
            }
            else if (percentage >= 75) {
                System.out.println("Grade: B");
            }
            else if (percentage >= 60) {
                System.out.println("Grade: C");
            }
            else if (percentage >= 40) {
                System.out.println("Grade: D");
            }

            System.out.println("Result: PASS");
        }
        else {
            System.out.println("Result: FAIL");
        }

    }
}