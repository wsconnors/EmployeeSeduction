import java.util.Scanner;

public class Console {
//    public scannerInput(String input) {}

    public static String getString(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    public static double getDouble(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextDouble();
    }

    public static int getInt(String prompt) {
        Scanner sc = new Scanner(System.in);
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
