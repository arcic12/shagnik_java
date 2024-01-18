package Lec8;
import java.util.*;
public class reverse_arr{

    public static void reverse(int arr[])
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the range");
        int n=sc.nextInt();
        
        int []arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

         reverse(arr);

        sc.close();
    }

}