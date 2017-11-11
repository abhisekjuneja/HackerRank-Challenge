/**
 * Solution To : "Java STDIN & STDOUT II"
 * Problem Statement: https://www.hackerrank.com/rest/contests/master/challenges/java-stdin-stdout/download_pdf?language=English
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