/**
 * Solution To : "Java Loops (I)"
 * Problem Statement: https://goo.gl/oyVgQX
 */

import java.util.Scanner;

public class Loops1 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int num = scan.nextInt();
  scan.close();
  for (int i = 1; i <= 10; i++) {
   System.out.printf("%d x %d = %d\n", num, i, (num * i));
  }
 }
}