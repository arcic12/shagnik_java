package Lec8;
import java.util.*;

public class largest_array {

    public static int  Max(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            
             if(max<arr[i])
             {
                max=arr[i];
             }
        }
       return max ;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the range ");
        int n=sc.nextInt();

        int []arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

       System.out.println("The maximum value is :"+ Max(arr));

        sc.close();
    }
}
