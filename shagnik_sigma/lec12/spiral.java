package lec12;
public class spiral {

    public static void main(String[] args) {

        int start_row=0;
        int start_column=0;

        int matrix[][]={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
                  

        int end_row=matrix.length;

        int end_column=matrix[0].length;


        for(int j=start_column;j<end_column;j++)
        {
            System.out.print(matrix[start_row][j]);
        }

        for(int i=start_row+1;i<end_row;i++)
        {
            System.out.print(matrix[i][end_column]);

        }

        for(int j=end_column-2;j>=start_column;j--)
        {
            System.out.print(matrix[end_row][j]);

            if(start_row==end_row)
            {
                break;
            }

        }
        for(int i=end_row-2;i>=start_row+1;i--)
        {
             System.out.print(matrix[i][start_column]);

              if(start_column==end_column)
              {
                 break;
              }
        }
        start_column++;
        start_row++;
        end_column--;
         end_row--;

       System.out.println();
            }
        }
        
        
    