package lec12;
import java.util.*;
public class search1 {
    public static boolean check_key(int matrix[][],int k)
    {
           
        int row=matrix.length-1,column=0;

        while(row>=0&&column<=matrix[0].length)
        {
           if(k==matrix[row][column])
           {
               System.out.println("The element is present at the index :"+"{"+row+","+column+"}");
               return true;
           }
           else if(k<matrix[row][column])
           {
              row--;
           }
           else 
           {
              column++;
           }
        }
        System.out.println("The key is not found");
        return false;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};

          System.out.println("Enter the number to be searched");

          int k=sc.nextInt();

          check_key(matrix, k);
        
          sc.close();
    }
}
