package lec12;

public class digonal_sum {

    public static void main(String[] args) {
        
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};

        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=(arr[i][i]+arr[i][arr.length-i-1]);
        }
         
         if(arr.length%2==0)
         {
            System.out.println(sum);
         }
         else
         {
            sum-=arr[(arr.length)/2][(arr.length)/2];
            System.out.println(sum);
         }
    }
    
}
