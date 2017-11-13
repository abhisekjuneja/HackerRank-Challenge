/**
 * Solution To : "Java STDIN & STDOUT II"
 * Problem Statement: https://goo.gl/CVZms3
*/

import java.util.Scanner;

public class Solution {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int integer = scan.nextInt();
  double floatingPointNumber = scan.nextDouble();
  scan.nextLine(); // Skiiping to the Next Line in STDIN to Access the Message
  String message = scan.nextLine();
  System.out.println("String: " + message);
  System.out.println("Double: " + floatingPointNumber);
  System.out.println("Int: " + integer);
 }
}