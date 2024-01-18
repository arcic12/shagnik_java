package Lec6;
 import java.util.*;
public class print_primes {

    public static boolean check_prime(int n) {
        if(n<=1)
        {
            return false;
        }
        for (int i = 2; i <(n); i++) {
          if (n % i == 0) {
            return false;
          }  
         }
        return true;
      }

  public static void print_prime(int n) {
    
    for (int i = 2; i <=n; i++) {
      
        check_prime(i);

        if(check_prime(i)==true)
        {
            System.out.println(i);
        }
     }
    
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number ");
    int n = sc.nextInt();

    print_prime(n);

    sc.close();
  }
}

