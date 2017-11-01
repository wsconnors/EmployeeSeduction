import java.util.Scanner;

public class Console {
    private static Scanner sc = new Scanner(System.in);

//    public scannerInput(String input) {}

    public static String getString(String prompt) {
        System.out.println(prompt);
        return sc.next();
    }

    public static double getDouble(String prompt) {
        System.out.println(prompt);
        return sc.nextDouble();
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }

    public static void print(String input) {
        System.out.println(input);
    }

    public static void quitHRApp() {
        System.exit(0);
    }

    public static void goBack(Menu aMenu) {
        aMenu.display();
    }
}
