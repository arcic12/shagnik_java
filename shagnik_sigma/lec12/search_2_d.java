package lec12;
import java.util.*;
public class search_2_d {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the rows");
        int n=sc.nextInt();

        System.out.println("Enter the columns");
        int m=sc.nextInt();

        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
           
        }

        System.out.println("Enter the element to be searched");
        int k=sc.nextInt();

        System.out.println("The array is ");
        for(int i=0;i<n;i++)
        {
         
          for(int j=0;j<m;j++)
          {
             if(k==arr[i][j])
             {
                System.out.print("the index of the element is : "+ i +"*"+j);

             }
          }
          System.out.println();
            
        }
       sc.close();
    }
    
}
