package Lec8;
import java.util.*;
public class binary_sort {

    public static int binary(int arr[],int b)
    {
        int start=0,end=arr.length-1;
        int mid;

        while(start<=end)
        {
            mid=(start+end)/2;
        if(b==arr[mid])
        {
           return  mid;
        }
        else if(arr[mid]<b)
        {
            start=mid+1;
        }
        else
        {
           end=mid-1;
        }
    }
    return -1;
}

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the range");
        int n=sc.nextInt();

        

        int []arr=new int[n];

        for(int i=0;i<n;i++)
        {

            arr[i]=sc.nextInt();

        } 
        System.out.println("Enter the number to be searched");
        int b=sc.nextInt();

       if(binary(arr, b)==-1)
       {

          System.out.println("The index not found");

       }
       else  
       {

        System.out.println("The index is : "+binary(arr, b));
        
       }
        
     sc.close();
    }
    
}

