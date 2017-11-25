/**
 * Solution To : "Java Currency Formatter"
 * Problem Statement: https://goo.gl/21ve72
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  double payment = scanner.nextDouble();
  scanner.close();

  Locale indianLocale = new Locale("en", "IN");

  NumberFormat USCurrency = NumberFormat.getCurrencyInstance(Locale.US);
  NumberFormat IndianCurrency = NumberFormat.getCurrencyInstance(indianLocale);
  NumberFormat ChineseCurrency = NumberFormat.getCurrencyInstance(Locale.CHINA);
  NumberFormat FrenchCurrency = NumberFormat.getCurrencyInstance(Locale.FRANCE);

  System.out.println("US: " + USCurrency.format(payment));
  System.out.println("India: " + IndianCurrency.format(payment));
  System.out.println("China: " + ChineseCurrency.format(payment));
  System.out.println("France: " + FrenchCurrency.format(payment));
 }
}