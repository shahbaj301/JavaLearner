public class datatypesdemo {
    public static void main(String[] args){
        byte b=23;
        short s=24345;
        int i=234567;
        long h=374765L;//use L for Long
        float f=23.4f;//accuray is 7 digit.if we take 0 before decimal it take 8 digit after the decimal
        double d=2345.67;//after decimal is 15 digit.we take 0 before decimal it take 18 digit after the decimal.
        //C language uses ASCII code scheme to store characters.ascii has the size of 1byte as it has range of 256 characters.
        //


        boolean r=true;
        char ch='s';



        System.out.println("b:"+b);
        System.out.println("s:"+s);
        System.out.println("i:"+i);
        System.out.println("h:"+h);
        System.out.println("f:"+f);
        System.out.println("d:"+d);
        System.out.println("r boolean value:"+r);
        System.out.println("character is:"+ch);
    }
    
}
