package Lec6;

import java.util.*;

public class binary_coeffficient {

  public static int fact(int n) {
    int mul = 1;

    for (int i = 1; i <= n; i++) {
      mul *= i;
    }
    return mul;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the upper limit");
    int n = sc.nextInt();

    System.out.println("Enter the lower limit");
    int k = sc.nextInt();

    int result = fact(n) / (fact(k) * fact(n - k));

    System.out.println("The binary coefficient of the number  is :" + result);

    sc.close();
  }
}
