package string;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("enter a digit");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 10) {
            System.out.println("I am 10");

        } else {
            System.out.println("I am not 10");
        }
    }

}
