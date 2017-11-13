/**
 * Solution To : "Java STDIN and STDOUT I"
 * Problem Statement: https://goo.gl/XtfdHD
 */

import java.util.Scanner;

public class STDINOUT1 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  for (int i = 0; i < 3; i++) {
   int numberFromSTDIN = scan.nextInt();
   System.out.println(numberFromSTDIN);
  }
 }
}