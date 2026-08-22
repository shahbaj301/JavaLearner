package classes;
import java.util.*;

public class ArrayOperations {
    Scanner sc;
    int arr[];
    int top;

    public ArrayOperations(int size){
        sc=new Scanner(System.in);
        arr=new int[size];
        top=-1;

    }

    //inserting element
    public void insert(){
        if(top==arr.length-1){
            System.out.println("Array id full");
            return;
        }

        System.out.print("Enter the number you want to store:");
        int num=sc.nextInt();

        top++;
        arr[top]=num;

    }

    //Display
    public void DisplayElements(){

        if(top==-1){
            System.out.println("ARRAY IS EMPTY:");
            return;
        }
        System.out.print("Elements of an array:");
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    public void search(){

        if(top==-1){
            System.out.println("ARRAY IS EMPTY:");
            return;
        }
        System.out.print("Enter the element to be searched:");
        int num=sc.nextInt();

        for(int i=0;i<=top;i++){
            if(num==arr[i]){
                System.out.println("Number "+num+" is found at:"+i);
                return;
            }
        }
        System.out.println("Number not found");
    }

    //Update
    public void update(){
        if(top==-1){
            System.out.println("ARRAY IS EMPTY:");
            return;
        }
        System.out.println("Enter the element to be updated:");
        int oldnum=sc.nextInt();

        for(int i=0;i<=top;i++){
            if(arr[i]==oldnum){
                System.out.print("Enter the new number:");
                int newNum=sc.nextInt();

                arr[i]=newNum;
                System.out.println("Number replaced successfully.");
                return;

            }
        }



    }

    //min
    public int mini(){
         if(top==-1){
            System.out.println("ARRAY IS EMPTY:");
            return -1;
        }
        int smallest=arr[0];
        for(int i=1;i<=top;i++){
            if(arr[i]<smallest){
                smallest=arr[i];

            }
        }
        return smallest;

    }
    //maxi
        public int maxi(){
         if(top==-1){
            System.out.println("ARRAY IS EMPTY:");
            return -1;
        }
        int largest=arr[0];
        for(int i=1;i<=top;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }
        }
        return largest;

    }

    //sum
    public int sum(){
        
        if(top==-1){
            System.out.println("ARRAY IS EMPTY:");
            return 0;
        }
        int sum=0;
        for(int i=0;i<=top;i++){
            sum+=arr[i];
        }
        return sum;

    }




    
}
