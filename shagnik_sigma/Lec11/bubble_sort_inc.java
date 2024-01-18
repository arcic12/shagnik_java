package Lec11;

public class bubble_sort_inc {

    public static void main(String[] args) {
        
        int arr[]={5,4,1,3,2};

        
   

        for(int i=0;i<arr.length;i++)
        {
            int swap=0;
            for(int j=0;j<arr.length-1-i;j++)
            
            {
                if(arr[j+1]<arr[j])
                {
                arr[j]=arr[j]+arr[j+1];
                arr[j+1]=arr[j]-arr[j+1];
                arr[j]=arr[j]-arr[j+1];

                swap++;
                }

                if(swap>0)
                {
                    
                }

            }
        }

        System.out.println("The increasing order of the array is ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
    
}
