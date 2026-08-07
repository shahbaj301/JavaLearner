import java.util.*;

public class Example1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character:");
        char c=sc.next().charAt(0);
        

        String ans=((c>='A' && c<='Z') || (c>='a' && c<='z'))?"Alphabet":((c>='0' && c<='9')?"Number":"Special Character");
        System.out.println("Character is:"+ans);




    }
}
