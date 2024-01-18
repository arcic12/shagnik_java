package Lec8;
import java.util.*;
public class finding_index
{
   public static int Index(int arr[],int b)
   {
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==b)
        {
            return i;
        }
    }
     return arr.length;
   }
  public static void main(String[] args) {

    Scanner sc=new Scanner (System.in);

    System.out.println("Enter the size");
    int n=sc.nextInt();

    int arr[]=new int[n];

    for(int i=0;i<n;i++)   
    {
        arr[i]=sc.nextInt();
    }
    
    System.out.println("Enter the number whose index has to be found");
    int b=sc.nextInt();

    if(Index(arr, b)==arr.length)
    {
       System.out.print("Index not found");
    }
    else{
    System.out.print("the index of the number is "+Index(arr, b));
    }
     sc.close();
  }
}