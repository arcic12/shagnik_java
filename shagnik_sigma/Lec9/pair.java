package Lec9;
import java.util.*;
public class pair {

    public static void main(String[] args) {
        
     Scanner sc=new Scanner (System.in);

     int count=0;
     System.out.println("Enter the range");
     int n=sc.nextInt();

     int []arr=new int[n];

     for(int i=0;i<n;i++)
     {
        arr[i]=sc.nextInt();
     }

     for(int i=0;i<n;i++)
     {
        for(int j=i+1;j<n;j++)
        {
            System.out.println(arr[i] +","+arr[j]);
            count++;
        }
     }
     System.out.println("The number of pairs is "+ count);
     sc.close();
    
  }
}
