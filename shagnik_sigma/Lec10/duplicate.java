package Lec10;

public class duplicate {

    public static boolean duplicate_member(int arr[])
    {
       for(int i=0;i<arr.length;i++)
       {
         for(int j=i+1;j<arr.length;j++)
         {
            if(arr[i]==arr[j])
            {
                return true;
            }
         }
       }
       return false;
    }
    public static void main(String[] args) {
        
        int arr[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println("does it contain dupilcate?"+" "+duplicate_member(arr));

        
    }
    
}