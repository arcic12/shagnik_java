package Lec7;

import java.util.*;

public class hollow_rhombus {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = n; j >= i; j--) {
        System.out.print("  ");
      }
      for (int j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || j == n ||   i == n) {
          System.out.print(" *");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
