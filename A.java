import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("PRINT THE VALUES");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("addition of a and b  " + a + b);
        System.out.println("subtration of a and b  " + (a - b));
        System.out.println("multiply ofa  and b  " + (a * b));
        System.out.println("division of a and b  " + (a / b));
        System.out.println("modulus  of a and b " + (a % b));

    }
}
