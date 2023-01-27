import java.util.Scanner;

public class Unaryop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = +a;
        System.out.println(b);
        int c = -a;
        System.out.println(c);
        int d = ++a;// pre increament
        System.out.println(d);
        int e = --a;
        System.out.println(e);
        int g = a++;
        System.out.println(g);
        int h = a--;// post dicreament

        System.out.println(h);
    }

}
