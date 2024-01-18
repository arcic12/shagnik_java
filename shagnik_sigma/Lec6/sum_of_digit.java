package Lec6;
import java.util.*;
public class sum_of_digit {

    public static int Sum_of_digit(int num)
    {
        int sum=0;
        while(num!=0)
        {
          int lastDigit=num%10;
          sum+=lastDigit;
          num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the number ");
        int num=sc.nextInt();
        
       int result=Sum_of_digit( num);

        System.out.println("The sum of the digit is "+result);
        sc.close();
    }
    
}
