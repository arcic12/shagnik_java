package Lec8;
import java.util.*;
public class sub_array {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the size of the array");
        int n =sc.nextInt();

        int []arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();//{2,4,6,8,10}
        }
        int sum=0;
        int max=Integer.MIN_VALUE;
        //(2),(2,4),(2,4,6),(2,4,6,8)(2,4,6,8,10).....

        for(int i=0;i<n;i++)
        {
            int start=i;
            
            for(int j=i;j<n;j++)
            {
                int end =j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];

                    

                    
                    
                }
                System.out.println();
                if(max<sum)
                    {
                        max=sum;
                    }

                sum=0;
    
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The no of sub array is "+ n*(n+1)/2);
        System.out.println("The max sum of the subarray is "+ max);
        sc.close();

    }
   
    
}
