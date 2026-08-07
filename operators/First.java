// package operators;

class First {
    public static void main(String[] args){
        //arithematic operator
        int a=10;
        int b=5;

        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;

        // System.out.println("Sum: " + sum);
        // System.out.println("Difference: " +sub);
        // System.out.println("Multiplication: " + mul);
        // System.out.println("Division: " + div);
        // System.out.println("Modulus: " + mod);

        //Unary Operators-->it is used to increase or decrease the value of a variable by 1.

        int c=10;
        int d=10;

        System.out.println("Postincrement:"+(c++));//it return the value first, then increment it.
        System.out.println("preincrement:"+(++c));//it increment first,then returns the updated value.
        //Same for the decrement operator


        //Assignment Operator.
        int num=5;
        System.out.println("Initial: " + num);
        num+=5;
        System.out.println("After add: " + num);
        num*=2;
        System.out.println("After mul: " + num);
        num-=2;
        System.out.println("After sub: " + num);
        num/=2;
        System.out.println("After divide: " + num);

        //Relational Operators--> return value as true and false

        int e=10;
        int f=3;

        System.out.println("e > f: " + (e > f));
        System.out.println("e < f: " + (e < f));
        System.out.println("e >= f: " + (e >= f));
        System.out.println("e <= f: " + (e <= f));
        System.out.println("e == f: " + (e == f));
        System.out.println("e != f: " + (e != f));

        //Logical Operators AND OR OR //
        boolean x=true;
        boolean y=false;
        System.out.println("x && y: " + (x && y));//return true only if both the value return true
        System.out.println("x || y: " + (x || y));//return true if any of value return true.
        System.out.println("!x: " + (!x));//reverse the boolean value.

        //Equations:
    // int z=10;
    // int w=20;
    // int m=z++ + w++;
    // System.out.println("m:"+m);
    int z=10;
    int w=10;
    int m=z++ + --w;
    System.out.println("m:"+m);

        

    }
    



    
}
