package lec12;
import java.util.*;
public class largest_smallest_2_D {

    public static void main(String[] args) {
        
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no of rows");
        int n=sc.nextInt();

        System.out.println("Enter the column");
        int m=sc.nextInt();

        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                largest=Math.max(largest,arr[i][j]);

                smallest=Math.min(smallest, arr[i][j]);
            }
        }

        System.out.println("The largest value is:"+largest);

        System.out.println("The smallest value is : "+smallest);
        sc.close();
    }
    
}
