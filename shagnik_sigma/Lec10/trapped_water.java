package Lec10;
public class trapped_water {

    public static int trapped(int height[])
    {
        int leftmax[]=new int [height.length];
        int rightmax[]=new int[height.length];   

        leftmax[0]=height[0];

        rightmax[height.length-1]=height[height.length-1];

        for(int i=1;i<height.length;i++)
        { 
           leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
       
        System.out.println("The left max boundary is ");
        for(int i=0;i<height.length;i++)
        {
            System.out.print(leftmax[i]+",");
        }

        for(int i=height.length-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }

        System.out.println("The right max boundary is ");
        for(int i=0;i<height.length;i++)
        {
            System.out.print(rightmax[i]+",");
        }

        int sum=0;

        for(int i=0;i<height.length;i++)
        {
            sum+=(Math.min(leftmax[i],rightmax[i])-height[i]);
        }

        return sum;

    }
    public static void main(String[] args) {
        
        int height[]={4,2,0,6,3,2,5};

        System.out.print("The trapped water is:"+trapped(height));

    }
    
}
