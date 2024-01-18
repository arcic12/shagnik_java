package Lec6;
import java.util.*;
public class multiply {
    
    public static int mul(int a,int b)
    {

        int mul_of_two_num=a*b;

        System.out.println("The product of two number is :"+mul_of_two_num);

        return 1;

    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the first number");
        int a=sc.nextInt();

        System.out.println("Enter the second number ");
        int b=sc.nextInt();

        mul(a, b);

        sc.close();
    }
}
