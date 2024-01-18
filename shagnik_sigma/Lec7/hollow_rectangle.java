package Lec7;

import java.util.*;

public class hollow_rectangle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the rows");
    int row = sc.nextInt();

    System.out.println("Enter the no of columns");
    int columns = sc.nextInt();

    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= columns; j++) {
        if (i == 1 || i == row || j == 1 || j == columns) {
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
