import java.util.*;

public class practise10 {

    public int countdigits(int num) {
        if (num == 0) return 1;
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public int calculatepower(int num, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= num;
        }
        return result;
    }

    public boolean checkArmstrong(int num) {
        int exp = countdigits(num);
        int sum = 0;
        for (int x = num; x > 0; x /= 10) {
            int m = x % 10;
            int r = calculatepower(m, exp);
            sum += r;
        }
        return sum == num;
    }

    public void printarmstrong(int s, int e) {
        for (int i = s; i <= e; i++) {
            if (checkArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Calculate Number of digits");
            System.out.println("2. Calculate Power");
            System.out.println("3. Check Armstrong");
            System.out.println("4. Print Armstrong");
            System.out.println("5. Exit");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter a number : ");
                    
                    int digits = countdigits(sc.nextInt());
                    System.out.println("Number of Digits : " + digits);
                    break;
                }
                case 2: {
                    System.out.println("Enter the number and its exponent : ");
                    int result = calculatepower(sc.nextInt(), sc.nextInt());
                    System.out.println("Result : " + result);
                    break;
                }
                case 3: {
                    System.out.println("Enter a number : ");
                    int num = sc.nextInt();
                    if (checkArmstrong(num)) {
                        System.out.println(num + " is an Armstrong Number!!");
                    } else {
                        System.out.println(num + " is NOT an Armstrong Number!!");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter start and End range : ");
                    printarmstrong(sc.nextInt(), sc.nextInt());
                    break;
                }
                case 5: {
                    System.out.println("GoodBye!!");
                    break;
                }
                default: {
                    System.out.println("You have entered wrong value!! Try Again!!");
                }
            }
        } while (choice != 5);

        sc.close();
        System.out.println("Have a Nice Day!!");
    }

    public static void main(String[] args) {
        practise10 obj = new practise10();
        obj.menu();
    }
}