public class MainMenu extends Menu{
    public static final MainMenu INSTANCE = new MainMenu();

     public enum mainMenuEnum {
         EMPLOYEE_DIRECTORY(1),
         INCIDENT_REPORTS(2),
         QUIT(3);

         private int value;

         mainMenuEnum(int num) {this.value = num;}
         public int getNum() {return value;}

     }

    public MainMenu() {
        super(mainMenuEnum.values());
        Console.print("  __  __       _         __  __                  \n" +
                " |  \\/  |     (_)       |  \\/  |                 \n" +
                " | \\  / | __ _ _ _ __   | \\  / | ___ _ __  _   _ \n" +
                " | |\\/| |/ _` | | '_ \\  | |\\/| |/ _ \\ '_ \\| | | |\n" +
                " | |  | | (_| | | | | | | |  | |  __/ | | | |_| |\n" +
                " |_|  |_|\\__,_|_|_| |_| |_|  |_|\\___|_| |_|\\__,_|\n" +
                "                                                 \n" +
                "                                                 ");
    }

    @Override
    public void userMenuSelection(String input) {
        switch (mainMenuEnum.valueOf(input)){
            case EMPLOYEE_DIRECTORY:
                employeeDirectory();
                break;

            case INCIDENT_REPORTS:
                incidentReports();
                break;

            case QUIT:
                Console.quitHRApp();
            }
    }

    private void incidentReports() {
        IncidentsMenu.INSTANCE.display();
    }

    private void employeeDirectory(){
        EmployeeDirectoryMenu.INSTANCE.display();
    }

    @Override
    public String toString() {
        String enumStrings =
                "1) Employee Directory\n" +
                "2) Incident Reports\n" +
                "3) Quit";
        return enumStrings;
    }
}

