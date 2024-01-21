package Lec10;

public class trapped_water1
{
    public static void main(String[] args) {
        
         int height[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};

         int leftmax[]=new int[height.length];
         int rightmax[]=new int[height.length];

         leftmax[0]=height[0];
         rightmax[height.length-1]=rightmax[height.length-1];
         

         for(int i=1;i<height.length;i++)
         {
            
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
           
         }
       
         for(int i=height.length-2;i>=0;i--)
         {
             rightmax[i]=Math.max(rightmax[i+1],height[i]);
         }

         int sum=0;
         for (int i=0;i<height.length;i++)
         {
            sum+=Math.min(leftmax[i], rightmax[i])-height[i];
         }

         System.out.print("the amount of water is "+sum);


    }
}