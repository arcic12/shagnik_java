package Lec6;
import java.util.*;
public class decimal_to_binary {

    public static void decimal_to_bi(int count,int b)
    {
        int rem1=0;
        for(int i=0;i<count;i++)
        {
            rem1+=(int)Math.pow(10,i)*(b%2);
            b/=2;
        }
        System.out.println(rem1);
        
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the decimal number ");
        int a=sc.nextInt();

        
        int c=a;
    
        int count=0;
        while(a!=0)
        {
            a=a/2;
            count++;
        }
        decimal_to_bi(count, c);
        sc.close();
    }
    
}
