package menu;


import utilities.Console;

public abstract class Menu {
    private Enum[] menuEnum;

    public Menu(Enum[] menuEnums) {
        this.menuEnum = menuEnums;
    }

    public abstract void userMenuSelection(String input);

    public void display() {
        String userInput;
        boolean tryCatch = true;

        do {
            try {
                do {
                    userInput = this.getInput().toUpperCase();
                    userMenuSelection(convertEnumsToNums(userInput));
                } while (!"quit".equalsIgnoreCase(userInput));
            } catch (IllegalArgumentException|ArrayIndexOutOfBoundsException e) {
                Console.print("\nINVALID INPUT!!! Please enter a valid menu option.");
                tryCatch = false;
            }
        }while (!tryCatch);
    }

    public String convertEnumsToNums(String menuNum) {
        int stringToNum = Integer.parseInt(menuNum)-1;
        return ""+this.menuEnum[stringToNum];
    }

    public String getInput() {
        this.menuTitle();
        Console.print(this.toString());
//        for (Enum e: menuEnum) {
//            utilities.Console.print(e.name());
//        }
        return Console.getString("");
    }

    public abstract void menuTitle();

    public abstract String toString();


}

