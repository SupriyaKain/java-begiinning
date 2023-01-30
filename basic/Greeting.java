import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String A = SC.next();
        SC.close();
        System.out.println("\"Hello " + A + ",Have a nice day\"");
    }

}
