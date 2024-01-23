package Lec10;
import java.util.*;
public class Max_sub_arr {

    public static int Max(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
              int  end =j;
                for(int k=start;k<=end;k++)
                {
                    sum+=arr[k];
                    if(max<sum)
                    {
                        max=sum;
                    }
                    
                }
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the range of the array");
        int a=sc.nextInt();

        int arr[]=new int[a];
   
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }

        //for printing the elements entered
        System.out.println("The element of the array to create a subarray is ");

         for(int i=0;i<arr.length;i++)
         {
            System.out.print(+arr[i]+" "+",");
         }

         System.out.println("the largest sum of the subarray is "+ Max(arr));

         sc.close();
    }


    
}
