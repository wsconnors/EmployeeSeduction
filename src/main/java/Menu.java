public abstract class Menu {
    private Enum[] menuEnum;

    public Menu(Enum[] menuEnums) {
        this.menuEnum = menuEnums;
    }

    public abstract void userSelection(String input);

    public String getInput() {
        for (Enum e: menuEnum) {
            Console.print(e.toString());
        }
        return Console.getString("Please select a menu: ");
    }
}
