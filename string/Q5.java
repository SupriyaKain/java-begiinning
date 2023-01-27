package string;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0) {

                if (year % 400 == 0) {
                    System.out.println("It's a Leap year");
                }
            }
        }

        else
            System.out.println("NOT A LEAP YEAR");

    }
}
