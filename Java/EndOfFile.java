/**
 * Solution To : "Java End Of File"
 * Problem Statement: https://goo.gl/8fnGKC
 */

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int counter = 0;
    while (scan.hasNext()) {
      System.out.println((++counter) + " " + scan.nextLine());
    }
    scan.close();
  }
}