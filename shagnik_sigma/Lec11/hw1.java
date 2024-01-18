package Lec11;

public class hw1 {

    public static void main(String[] args) {
        
       int arr[]={3,6,2,1,8,7,4,5,3,1};

       for(int i=0;i<arr.length-1;i++)
       {
          for(int j=0;j<arr.length-1-i;j++)
          {
              if(arr[j+1]>arr[j])
              {
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
              }
          }
       }

       System.out.print("The sorted array is ");
       
       for(int i=0;i<arr.length;i++)
       {
          System.out.print(arr[i]+" ");
       }
    }
    
}
