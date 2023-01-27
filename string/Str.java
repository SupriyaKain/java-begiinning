package string;

public class Str {
    public static void main(String[] args) {
        String line = "sabdo";
        System.out.println(line.length());
        System.out.println(line.toLowerCase());
        System.out.println(line.toUpperCase());
        System.out.println(line.trim());
        System.out.println(line.substring(4));
        System.out.println(line.substring(5, 16));
        System.out.println(line.replace("n", "a"));
        System.out.println(line.startsWith("bd"));
        System.out.println(line.endsWith("na"));
        System.out.println(line.indexOf("e", 3));
        System.out.println(line.lastIndexOf("m"));
        System.out.println(line.equals("sabdo"));
        System.out.println(line.equalsIgnoreCase("khel"));

    }

}
