package Lec11;

public class selection_sort {

    public static void main(String[] args) {
        
        int arr[]={2,5,10,9};


        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
               
            }
            int k=arr[i];

            arr[i]=arr[min];
            arr[min]=k;



        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
