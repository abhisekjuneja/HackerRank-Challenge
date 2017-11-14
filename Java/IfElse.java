/**
 * Solution To : "Java If Else"
 * Problem Statement: https://goo.gl/AiWBAe
 */

import java.util.Scanner;

public class Solution {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  scan.close();
  if (n % 2 == 1)
   System.out.print("Weird");
  else {
   if (n >= 2 && n <= 5)
    System.out.print("Not Weird");
   else if (n >= 6 && n <= 20)
    System.out.print("Weird");
   else if (n > 20)
    System.out.print("Not Weird");
  }
 }
}