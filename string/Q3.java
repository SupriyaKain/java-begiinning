package string;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(" write your income");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        sc.close();
        Float tax = 0f;
        if (income <= 250000) {
            System.out.println("no tax");
        } else if (income > 250000 && income <= 500000) {
            tax = (tax + 0.05f * (income - 250000));
            System.out.println("tax:" + tax);
        } else if (income > 500000 && 1000000 >= income) {
            tax = tax + 0.05f * (500000 - 250000);
            tax = tax + 0.2f * (income - 500000);
            System.out.println("tax:" + tax);
        } else {

            tax = tax + 0.05f * (500000 - 250000);
            tax = tax + 0.2f * (1000000 - 500000);
            tax = tax + 0.3f * (income - 1000000);
            System.out.println("your tax is :" + tax);
        }

    }

}
