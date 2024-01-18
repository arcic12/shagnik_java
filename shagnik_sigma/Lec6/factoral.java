package Lec6;
import java.util.*;
public class factoral {
    
    public static int fact(int n)
    {
        int mul=1;

       for(int i=1;i<=n;i++)
       {
          mul*=i;
       }
       return mul;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the factoral of the number to be calculated");
        int n=sc.nextInt();

       int result= fact(n);

       System.out.println("The factoral of the number is :"+result);

       sc.close();
    }
}
