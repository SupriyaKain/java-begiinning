import java.util.Scanner;

public class Relationalop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        /*
         * >,<,<=,>=,==,!=
         */
        boolean result = a > b;
        System.out.println(result);
    }

}
