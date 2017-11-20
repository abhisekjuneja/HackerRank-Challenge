/**
 * Solution To : "Java Static Initializer Block"
 * Problem Statement: https://goo.gl/59rD95
 */

import java.util.Scanner;

public class StaticInitializerBlock {
  public static int B, H;
  public static boolean flag = true;
  
  static {
    Scanner scan = new Scanner(System.in);
    B = scan.nextInt();
    H = scan.nextInt();
    scan.close();
    try {
      if (B <= 0 || H <= 0) {
        flag = false;
        throw new Exception("Breadth and height must be positive");
      }
    } catch (Exception exception) {
      System.out.print(exception);
    }
  }

  public static void main(String[] args) {
    if (flag) {
      int area = B * H;
      System.out.print(area);
    }
  }
}