/**
 * Solution To : "Java Loops (II)"
 * Problem Statement: https://goo.gl/6FVMeK
 */

import java.util.Scanner;

class Loops2 {
 public static void main(String[] argh) {
  Scanner scan = new Scanner(System.in);
  int t = scan.nextInt();
  for (int i = 0; i < t; i++) {
   int a = scan.nextInt();
   int b = scan.nextInt();
   int n = scan.nextInt();
   int output = a;
   for (int j = 0; j < n; j++) {
    output = output + (b * (int) Math.pow(2, j));
    System.out.print(output + " ");
   }
   System.out.println();
  }
  scan.close();
 }
}