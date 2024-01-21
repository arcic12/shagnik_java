package Lec11;

public class test {

    public static void main(String[] args) {
        
        int arr[]={1,0,8,3,4};

        //bubble sort

        // for(int i=0;i<arr.length-1;i++)
        // {
        //     for(int j=i;j<arr.length-1-i;j++)
        //      {
        //          if(arr[j]>arr[j+1])
        //          {
        //              int temp=arr[j+1];
        //              arr[j+1]=arr[j];
        //              arr[j]=temp;
        //          }
        //      }
        // }

        //selection sort

        // for(int i=0;i<arr.length-1;i++)
        // {
        //     int minPos=i;
        //     for(int j=i+1;j<arr.length;j++)
        //     {   
        //         if(arr[minPos]>arr[j])
        //         {
        //             minPos=j;
        //         }
        //     }
        //       int temp =arr[minPos];
        //       arr[minPos]=arr[i];
        //       arr[i]=temp;
        // }
        
        
        // for(int i=1;i<arr.length;i++)
        // {
        //     int current=arr[i];
        //     int previous=i-1;

        //     while (previous>=0&&arr[previous]<current) {
        //         {
        //             arr[previous+1]=arr[previous];
        //             previous--;
        //         }
                
        //     }
        //     arr[previous+1]=current;
           
        // }

        int largest =Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];

        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        
        int j=0;
        for(int i=0;i<count.length;i++)
        {
           while(count[i]>0)
           {
            arr[j]=i;
            j++;
            count[i]--;

           }
        }
        for(int i=0;i<arr.length;i++)

        {
            System.out.print(arr[i]+" "+",");
        }
        
    }
    
}
