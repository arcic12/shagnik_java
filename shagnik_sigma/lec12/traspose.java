package lec12;

public class traspose {

    public static void main(String[] args) {
        
        int matrix[][]={{1},
                        {4},
                        {7}};

        int transpose[][]=new int[matrix[0].length][matrix.length];

       
         for(int i=0;i<matrix[0].length;i++)
         {
            for(int j=0;j<matrix.length;j++)
            {
                transpose[i][j]=matrix[j][i];
            }
         }

         System.out.println("The transpose of the matrix is :");
         for(int i=0;i<matrix[0].length;i++)
         {
            for(int j=0;j<matrix.length;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
         }
    }
    
}
