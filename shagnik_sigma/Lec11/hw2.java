package Lec11;
public class hw2 {
    
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};


         for(int i=0;i<arr.length-1;i++)
         {
               int maxPos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                

                 if(arr[maxPos]<arr[j])
                 {
                    maxPos=j;
                 }
                 
                 
            }
            
            int temp=arr[i];
            arr[i]=arr[maxPos];
            arr[maxPos]=temp;
            

            
         }
         printArray(arr);
    }
}
