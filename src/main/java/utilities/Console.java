package utilities;

import menu.Menu;

import java.util.Scanner;

public class Console {
    private static Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    public static double getDouble(String prompt) {
        sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextDouble();
    }

    public static int getInt(String prompt) {
        sc = new Scanner(System.in);
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

