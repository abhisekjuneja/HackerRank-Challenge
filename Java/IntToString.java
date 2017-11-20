/**
 * Solution To : "Java Int To String"
 * Problem Statement: https://goo.gl/RjxMYL
 */

import java.util.*;
import java.security.*;
public class IntToString {
  public static void main(String[] args) {
    DoNotTerminate.forbidExit();
    try {
      Scanner in = new Scanner(System.in);
      int n = in .nextInt(); in .close();
      Integer myInt = new Integer(n);
      String s = myInt.toString();
      if (n == Integer.parseInt(s)) {
          System.out.println("Good job");
      } else {
          System.out.println("Wrong answer.");
      }
    } catch (DoNotTerminate.ExitTrappedException e) {
      System.out.println("Unsuccessful Termination!!");
    }
  }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

  public static class ExitTrappedException extends SecurityException {
    private static final long serialVersionUID = 1;
  }

  public static void forbidExit() {
    final SecurityManager securityManager = new SecurityManager() {
      public void checkPermission(Permission permission) {
          if (permission.getName().contains("exitVM")) {
              throw new ExitTrappedException();
          }
      }
    };
    System.setSecurityManager(securityManager);
  }
}