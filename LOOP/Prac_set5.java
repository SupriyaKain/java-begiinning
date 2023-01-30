package LOOP;

import java.util.Scanner;

import javax.swing.plaf.multi.MultiButtonUI;

public class Prac_set5 {// QUESTION 1

    public static void main(String[] args) {
        /*
         * int n = 4;
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= n + 1 - i; j++) {
         * System.out.print("*");
         * 
         * }
         * System.out.println();
         * }
         */
        // QUESTION 2
        /*
         * System.out.println("enter the digit");
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * int m = 2 * n;
         * int i = 0;
         * int sum = 0;
         * 
         * while (i <= m) {
         * if (i % 2 == 0) {
         * sum = sum + i;
         * }
         * i++;
         * 
         * }
         * System.out.println(sum
         * 
         * );
         */
        // QUESTION 3
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("enter the number");
         * int n1 = sc.nextInt();
         * int n2;
         * System.out.println("table of " + n1);
         * for (int i = 1; i <= 10; i++) {
         * n2 = n1 * i;
         * System.out.println(+n1 + " X " + i + " = " + n2);
         * }
         */

        // QUESTION 4
        /*
         * int n = 10;
         * System.out.println("Reverse mulply table of 10");
         * int Mul;
         * for (int i = 10; i <= 10; i--) {
         * if (i > 0) {
         * Mul = n * i;
         * System.out.println(n + " X " + i + " = " + Mul);
         * }
         * 
         * }
         */
        // QUESTION 5
        /*
         * System.out.println("enter the no. to find it's factorial");
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * int mult = 1;
         * for (int i = 0; i < n; i++) {
         * mult = mult * (n - i);
         * 
         * }
         * System.out.println(mult);
         */

        // QUESTION 9
        /*
         * int n = 8;
         * Scanner sc = new Scanner(System.in);
         * System.out.
         * println(" enter the no. till that you want the mulplcation table of 8");
         * int m = sc.nextInt();
         * int sum = 0;
         * for (int i = 1; i <= m; i++) {
         * 
         * int mult = n * i;
         * System.out.println("8" + " X " + i + " = " + mult);
         * 
         * sum = sum + mult;
         * }
         * System.out.
         * println("Sum of the number occuring in the multiplication table of 8  is   "
         * + sum);
         */

        // QUESTION 10(i)
        int i = 1;
        do {
            System.out.println("do while");
            i++;
        } while (i <= 2);

    }
}
