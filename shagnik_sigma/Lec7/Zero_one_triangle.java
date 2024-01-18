package Lec7;
import java.util.*;
public class Zero_one_triangle {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the range");
        int n=sc.nextInt();

        int count=1;

        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                count=0;
            }
            else
            {
                count=1;
            }
            for(int j=1;j<=i;j++)
            {
                if(count==0)
                {
                    System.out.print(count+" ");
                    count++;
                }
                else if (count==1)
                {
                   System.out.print(count+" ");
                   count--;
                }
            }
            System.out.println();
            
        }
        sc.close();
    }
}
