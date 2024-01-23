package Lec10;
public class prefix {

    public static void main(String[] args) {

        int arr[]={1,-2,3,4,5};

        int prefix[]=new int[arr.length];

       int sum=0;
       int max=Integer.MIN_VALUE;

       prefix[0]=arr[0];


       for(int i=1;i<arr.length;i++)
       {
          prefix[i]=prefix[i-1]+arr[i];
       }

        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
               int end=j;

                sum=start==0?prefix[end]:prefix[start]-prefix[end-1];
                if(sum>max)
                {
                    max=sum;
                }

            }
        }
        System.out.println("The maximum element of the subarray is "+ max);


    }
}
