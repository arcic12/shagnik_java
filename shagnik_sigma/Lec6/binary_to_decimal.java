package Lec6;
import java.util.*;
public class binary_to_decimal {

    public static void binary(int count,int num1)
    {
        int sum=0;
        for(int i=0;i<=count;i++)
        {
           int lastDigit=num1%10;

           int a=(int)Math.pow(2,i)*lastDigit;

           sum+=a;

           num1/=10;

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the binary");
        int num=sc.nextInt();

        int num1=num;

        int count=0;
        while(num!=0)
        {
            count++;
            num/=10;
        }
        binary(count,num1);
        
        sc.close();
    }
    
}
