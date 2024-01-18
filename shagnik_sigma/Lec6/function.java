package Lec6;
public class function {

    public static void main(String[] args) {
        
        int a=2;
        int b=5;

        int c=Math.min(a, b);//to find the minimum value 
        System.out.println("The minimum value is "+ c);

        int d=Math.max(a, b);//to ind the maximum value 
        System.out.println("The maximum value is "+ d);

        int e=(int)Math.pow(a, b);//to find the power of two number
        System.out.println("the " +b+" th power of "+ a +" is " + e);

        int f=-3;

        int g=(int)Math.abs(f);//to find the absolute value

        System.out.println("The absolute balue of "+ f  +" is " + g);
    }
}

