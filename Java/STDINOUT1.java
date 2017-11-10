/**
 * Solution To : "Java Stdin and Stdout I"
 * Problem Statement: https://www.hackerrank.com/rest/contests/master/challenges/java-stdin-and-stdout-1/download_pdf?language=English
*/

import java.util.Scanner;

public class STDINOUT1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        for(int i = 0; i < 3; i++) {
            int numberFromSTDIN = scan.nextInt();
            System.out.println(numberFromSTDIN);
        }        
    }
}