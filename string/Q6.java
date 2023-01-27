package string;

import java.util.Scanner;

public class Q6 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("enter the URL");

        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        if (url.endsWith(".com")) {
            System.out.println("Commertial website");

        } else if (url.endsWith(".org")) {
            System.out.println("Organization website");

        } else if (url.endsWith(".in")) {
            System.out.println("Indian website");
        }

    }

}
