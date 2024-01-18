package Lec11;
import java.util.*;
import java.util.Collections;
public class inbuilt_sort {

    public static void main(String[] args) {
        
        Integer arr[]={5,2,3,1};

        Arrays.sort(arr,Collections.reverseOrder());

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
