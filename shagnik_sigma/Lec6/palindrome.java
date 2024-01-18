package Lec6;
import java.util.*;
public class palindrome {

    public static boolean check_palindrome(int a,int b)
    {
       if(a==b)
       {
        return true;
       }
       else
       {
        return false;
       }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int num=sc.nextInt();

        int num1=num;

        int newNum=0;
        while(num!=0)
        {
            int lastDigit=num%10;
            newNum=newNum*10+lastDigit;
            num/=10;
            
        }
        System.out.println(check_palindrome(num1, newNum));

        sc.close();

    }
    
}
