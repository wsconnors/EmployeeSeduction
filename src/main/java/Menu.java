public abstract class Menu {
    private Enum[] menuEnum;

    public Menu(Enum[] menuEnums) {
        this.menuEnum = menuEnums;
    }

    public abstract void userMenuSelection(String input);

    public void display() {
        String userInput;

        do {
            userInput = this.getInput().toUpperCase();
            userMenuSelection(userInput);
        }while (!"quit".equalsIgnoreCase(userInput));
    }

    public String getInput() {
        //Console.print(this.toString());
        this.menuTitle();
        for (Enum e: menuEnum) {
            Console.print(e.name());
        }
        return Console.getString("");
    }

    public abstract void menuTitle();


}

