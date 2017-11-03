public abstract class Menu {
    private Enum[] menuEnum;

    public Menu(Enum[] menuEnums) {
        this.menuEnum = menuEnums;
    }

    public abstract void userMenuSelection(String input);


    public void display() {
        String userInput;
        boolean trycatch = true;

        do {
            try {
                do {
                    userInput = this.getInput().toUpperCase();
                    userMenuSelection(userInput);
                } while (!"quit".equalsIgnoreCase(userInput));
            } catch (IllegalArgumentException e) {
                Console.print("!!!INVALID INPUT!!!");
                trycatch = false;
            }
        }while(!trycatch);
    }




    public String getInput() {
        for (Enum e: menuEnum) {
            Console.print(e.name());
        }
        return Console.getString("");
    }
}

