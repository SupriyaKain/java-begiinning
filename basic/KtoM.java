import java.util.Scanner;

public class KtoM {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("distance in kilometer");
        float k = Sc.nextFloat();
        Sc.close();

        double m = k * 0.621;
        System.out.println(m);

    }

}
