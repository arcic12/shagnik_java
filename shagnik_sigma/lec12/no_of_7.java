package lec12;

public class no_of_7 {

    public static void main(String[] args) {
        
        int matrix[][]={{4,7,8},
                        {8,8,7}};

        int count=0;

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==7)
                {
                    count++;
                }
            }
        }
        System.out.println("The no of 7's in the array is "+count);
    }
    
}
