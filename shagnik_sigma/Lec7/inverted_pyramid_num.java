package Lec7;
import java.util.*;
public class inverted_pyramid_num {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the range");
        int n=sc.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");

            }
            System.out.println();
        }
        sc.close();
    }
    
}
