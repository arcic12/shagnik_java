package Lec6;
import java.util.*;
public class check_even {

    public static boolean checkEven(int a)
    {
        if(a%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number ");
        int a=sc.nextInt();

        System.out.println(checkEven(a));

        sc.close();
    }
    
}
