package Lec6;
import java.util.*;
public class sum {
    public static int sum_of_numbers(int a,int b)
    {
      int sum=0;

      sum=a+b;
      return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the first number ");
        int a=sc.nextInt();

        System.out.println("Enter the second number ");
        int b=sc.nextInt();

        int result=sum_of_numbers(a, b);

        System.out.println("The sum of the number is :"+result);

        sc.close();
    }

    
}
