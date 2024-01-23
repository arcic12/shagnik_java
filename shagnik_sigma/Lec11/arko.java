package Lec11;

public class arko {

  public static void print(int arr[]) {
    System.out.println("The increasing array is ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {4,10,9,2,0};

    // for(int i=0;i<arr.length-1;i++)
    // {
    //     for(int j=0;j<arr.length-1-i;j++)
    //     {
    //          while(arr[j+1]<arr[j])
    //          {
    //             int temp=arr[j];
    //             arr[j]=arr[j+1];
    //             arr[j+1]=temp;
    //          }
    //     }
    // }
    // print(arr);

    // for(int i=0;i<arr.length-1;i++)
    // {
    //     int minpos=i;
    //     for(int j=i;j<arr.length;j++)
    //     {
    //         if(arr[minpos]<arr[j])
    //         {
    //             minpos=j;
    //         }
    //     }
    //     int temp =arr[i];
    //     arr[i]=arr[minpos];
    //     arr[minpos]=temp;
    // }
    // print(arr);

    // for(int i=1;i<arr.length;i++)
    // {
    //     int current =arr[i];
    //     int previous=i-1;

    //     while(previous>=0&&current<arr[previous])

    //     {
    //         arr[previous+1]=arr[previous];
    //         previous--;
    //     }

    //     arr[previous+1]=current;
    // }
    // print(arr);

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
    }

    int count[] = new int[max + 1];

    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    int j = 0;

    for (int i = 0; i < count.length; i++)
     {
      while (count[i] > 0) 
      {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
    print(arr);
  }
}
