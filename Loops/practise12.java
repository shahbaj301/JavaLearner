import java.util.*;


public class practise12 {
    public void paramid1(int rows){
        

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");

            }
            System.out.println();

        }
        
        

    }
    public void pyramid2(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();

        }
        
    }

    public void paramid3(int rows){
        int digits=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(digits+" ");
                digits++;


            }
            System.out.println();
        }
    }
    public void paramid4(int rows) {
    for (int i = 1; i <= rows; i++) {
        for (int j = i; j >= 1; j--) {
            System.out.print(j);
        }
        System.out.println();
    }

        //System.out.println();

    }
    public void pyramid5(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=i;j<=rows-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        //System.out.println();
    }
    public void menu()
    {
        Scanner sc=new Scanner(System.in);

        int choice;
        do
        {
            System.out.println("======================================================================");
            System.out.println("Welcome to the world of patterns.");
            System.out.println("0. Exit");
            System.out.println("1. Pyramid 1");
            System.out.println("2. Pyramid 2");
            System.out.println("3. Pyramid 3");
            System.out.println("4. Pyramid 4");
            System.out.println("5. Pyramid 5");
            System.out.println("======================================================================");

            System.out.print("Enter your choice : ");
            choice=sc.nextInt();

            if(choice==0) System.out.println("GoodBye");
            else {
                System.out.print("Enter number of rows : ");
                int rows=sc.nextInt();

                if (choice == 1) paramid1(rows);
                else if(choice==2) pyramid2(rows);
                else if(choice==3) paramid3(rows);
                else if(choice==4) paramid4(rows);
                else if(choice==5) pyramid5(rows);
                else System.out.println("Wrong Choice!! Try Again!!");
            }
        }while(choice!=0);
    }
    public static void main(String[] args) {
        practise12 pd=new practise12();
        pd.menu();
    }
        


    
}
