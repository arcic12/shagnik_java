package Lec10;

import java.util.*;

public class kadanes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;
    int max=Integer.MIN_VALUE;

    int arr[] = {-2,-3,4,-1,-2,1,5,-3};

    for(int i=0;i<arr.length;i++)
    {
        sum+=arr[i];
        if(sum>0) 
        {
            if(max<sum)
            {
                max=sum;
            }
            
        } 
        else
        {
            sum=0;
        }   
    }
    System.out.println("the maximum element of the subarray is "+max);

    sc.close();

      }
    }

