package Lec6;
import java.util.*;
public class swap {

    public static void swap_of_two(int a,int b)
    { 
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("The new first number is :"+a);
        System.out.println("The new swapped second number is :"+b);

    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number ");
        int num1=sc.nextInt();

        System.out.println("Enter the second number ");
        int num2=sc.nextInt();

        swap_of_two(num1, num2);

        sc.close();
    }
    
}
