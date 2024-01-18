package Lec11;

public class bubble_sort_decr{



    public static void main(String[] args) {
        
        int arr[]={5,4,1,3,2};

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j+1]>arr[j])
                {
                arr[j]=arr[j]+arr[j+1];
                arr[j+1]=arr[j]-arr[j+1];
                arr[j]=arr[j]-arr[j+1];
                }

            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
    
}
    

