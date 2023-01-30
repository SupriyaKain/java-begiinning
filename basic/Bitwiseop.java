import java.util.Scanner;

public class Bitwiseop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  two values ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = ~b;// Bitwise NOT(~)
        int d = a & b;// Bpitwise AND(&)
        int e = a | b;// BItwise OR(|)
        int g = a ^ b;// Bitwise XOR()
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(g);

    }

}
