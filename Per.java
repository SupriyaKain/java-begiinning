import java.util.Scanner;

public class Per {

    public static void main(String[] args) {
        System.out.println("type  the value");
        Scanner SC = new Scanner(System.in);

        int a = SC.nextInt();
        int b = SC.nextInt();
        int c = SC.nextInt();
        int d = SC.nextInt();
        int e = SC.nextInt();
        SC.close();
        int oT = a + b + c + d + e;
        System.out.println("total of five sub marks " + oT);
        int p = oT / 5;
        System.out.println("percentage is" + p + "%");
    }

}
