package LOOP;

public class P3 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        int n = 5;
        /*
         * {
         * for (int i = 1; i <= 4; i++) {
         * 
         * for (int j = 1; j <= 5; j++) {
         * if (i == 4 || j == 5 || i == 1 || j == 1)
         * 
         * {
         * System.out.print("*");
         * 
         * } else {
         * System.out.print(" ");
         * }
         * }
         * System.out.println("");
         * }
         * }
         * }
         * }
         */
        // question--4
        /*
         * for (int i = 0; i <= n; i++) {
         * for (int j = 0; j <= n - i; j++) {
         * System.out.print("*");
         * }
         * System.out.println(" ");
         * }
         * }
         * }
         */
        // question --5
        /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= n; j++) {
         * if (j <= n - i) {
         * System.out.print(" ");
         * } else {
         * System.out.print("*");
         * }
         * }
         * System.out.println("");
         * 
         * }
         * }
         * 
         * }
         */
        // question--6
        /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print(j);
         * }
         * System.out.println();
         * }
         * }
         * }
         */
        // question --7
        /*
         * for (int i = 0; i <= n; i++) {
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(j);
         * }
         * System.out.println();
         * }
         * }
         * }
         */
        // question --8
        /*
         * for (int i = 0; i <= n; i++) {
         * for (int j = 0; j <= i; j++) {
         * System.out.print(i + j + 1);
         * System.out.print(" ");
         * }
         * System.out.println();
         * }
         * }
         * }
         */
        // question --9

        /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= i; j++) {
         * int k = i + j;
         * if (k % 2 == 0) {
         * System.out.print("1");
         * 
         * } else {
         * System.out.print("0");
         * }
         * }
         * System.out.println();
         * }
         */
    }
}
