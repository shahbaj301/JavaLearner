import java.util.Scanner;

public class productarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int size=sc.nextInt();

        int arr[]=new int[size];


        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int prod=1;
        for(int i=0;i<size;i++){
            prod*=arr[i];
        }
        System.out.println("Product of array is:"+prod);
    }
}
