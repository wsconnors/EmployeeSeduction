public class MainMenu extends Menu{
    public static final MainMenu INSTANCE = new MainMenu();

     enum mainMenuEnum {
         EMPLOYEE_DIRECTORY,
         INCIDENT_REPORTS,
         QUIT}

    public MainMenu() {
        super(mainMenuEnum.values());
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
        IncidentsMenu incidentsMenuMenu = new IncidentsMenu();
        incidentsMenuMenu.display();
    }

    private void employeeDirectory(){
        EmployeeDirectoryMenu employeeDirectoryMenuMenu = new EmployeeDirectoryMenu();
        employeeDirectoryMenuMenu.display();
    }
}

