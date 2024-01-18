package Lec6;
import java.util.*;
public class average {

    public static double Average_of_three(double a,double  b, double  c)
    {
        double average=(a+b+c)/3;

        return average;

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number ");
        double a=sc.nextDouble();

        System.out.println("Enter the second number ");
        double b=sc.nextDouble();

        System.out.println("Enter the third number");
        double c=sc.nextDouble();

        double result=Average_of_three(a, b, c);

        System.out.println("The average of the three numbers are "+result);
        sc.close();
        
    }
    
}
