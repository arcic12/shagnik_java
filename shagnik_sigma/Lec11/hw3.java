package Lec11;

public class hw3 {

   public static void main(String[] args) {
    
    int arr[]={3,6,2,1,8};

      for(int i=1;i<arr.length;i++)
      {
         int current =arr[i];
         int previous=i-1;

         while(previous>=0&&arr[previous]<current)
         {
            arr[previous+1]=arr[previous];
            previous--;
         }

         arr[previous+1]=current;
      }
 
      System.out.println("The updated array is :");
      for(int i=0;i<arr.length;i++)
      {
         System.out.print(arr[i]+" ");
      }
   }
    
}
