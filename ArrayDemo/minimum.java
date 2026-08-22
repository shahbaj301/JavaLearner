import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int size=sc.nextInt();

        int arr[]=new int[size];


        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int mini=arr[0];
        for(int i=0;i<size;i++){
            if(mini>arr[i]){
                mini=arr[i];
            }

        }
        System.out.println("Maximum of array is:"+mini);

    }
    
}

    
