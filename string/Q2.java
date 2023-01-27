package string;

import java.util.Scanner;

public class Q2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(" enter the marks of first sub. ");
        Scanner sc = new Scanner(System.in);

        float e = sc.nextFloat();
        System.out.println("marks of second subject");
        float g = sc.nextFloat();
        System.out.println("marks of third sub.");
        float h = sc.nextFloat();
        sc.close();
        float p = (e + g + h) / 3;
        System.out.println("your percentage is" + p + "%");
        if (e >= 33 && g >= 33 && h >= 33 && p >= 40) {
            System.out.println("pass");

        } else {
            System.out.println("fail");
        }
        ;

    }
}
