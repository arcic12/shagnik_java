package lec12;

public class sum_of_2nd_row {

    public static void main(String[] args) {
        
        int matrix[][]={{1,4,9},
                        {11,4,3},
                        {2,2,3}};
        int sum=0;

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==1)
                {
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("the sum of the second row is "+sum);
    }
    
}
