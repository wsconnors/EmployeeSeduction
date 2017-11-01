import java.util.Scanner;

public class Console {
    private Scanner userInput;

//    public scannerInput(String input) {}

    public static String getString(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static double getDouble(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void print(String input) {
        System.out.println(input);
    }
}
