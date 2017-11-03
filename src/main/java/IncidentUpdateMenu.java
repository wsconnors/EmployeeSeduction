import java.util.ArrayList;

public class IncidentUpdateMenu extends Menu{
    public static final IncidentUpdateMenu INSTANCE = new IncidentUpdateMenu();

    public enum updateIncidentEnum {ADD_EMPLOYEE_INVOLVED, DELETE_EMPLOYEE_INVOLVED, DESCRIPTION, DATE, ID, BACK, QUIT}

    private Incident incident;

    public Incident getIncident() {
        return incident;
    }

    public void setIncident(Incident incident) {
        this.incident = incident;
    }

    public IncidentUpdateMenu() {
        super(IncidentUpdateMenu.updateIncidentEnum.values());
    }

    @Override
    public void menuTitle() {
        Console.print(
                "  _____            _     _            _     _    _           _       _        \n" +
                " |_   _|          (_)   | |          | |   | |  | |         | |     | |       \n" +
                "   | |  _ __   ___ _  __| | ___ _ __ | |_  | |  | |_ __   __| | __ _| |_ ___  \n" +
                "   | | | '_ \\ / __| |/ _` |/ _ \\ '_ \\| __| | |  | | '_ \\ / _` |/ _` | __/ _ \\ \n" +
                "  _| |_| | | | (__| | (_| |  __/ | | | |_  | |__| | |_) | (_| | (_| | ||  __/ \n" +
                " |_____|_| |_|\\___|_|\\__,_|\\___|_| |_|\\__|  \\____/| .__/ \\__,_|\\__,_|\\__\\___| \n" +
                "                                                  | |                         \n" +
                "                                                  |_|                         ");
        Console.print("========================================================================================");

    }

    @Override
    public void userMenuSelection(String input) {

        switch (IncidentUpdateMenu.updateIncidentEnum.valueOf(input)){
            case ADD_EMPLOYEE_INVOLVED:
                addEmployeesInvolved();
                break;
            case DELETE_EMPLOYEE_INVOLVED:
                deleteEmployeesInvolved();
                break;
            case DESCRIPTION:
                updateIncidentDescription();
                break;
            case DATE:
                updateIncidentDate();
                break;
            case BACK:
                Console.goBack(IncidentsMenu.INSTANCE);
                break;
            case QUIT:
                Console.quitHRApp();
                break;
        }
    }

    public void addEmployeesInvolved() {
        String menuChoice = "Yes";
        ArrayList<Employee> employeesInvolved = new ArrayList <>();

        while("Yes".equalsIgnoreCase(menuChoice)){
            int idInvolved = Console.getInt("Enter ID of employee involved: ");
            Employee employeeInvolved = EmployeeWareHouse.getEmployeeById(idInvolved);
            employeesInvolved.add(employeeInvolved);
            menuChoice = Console.getString("Would you like to add another employee?: 'Yes' or 'No'");
        }

        this.incident.getEmployeesInvolved().addAll(employeesInvolved);
    }

    public void deleteEmployeesInvolved() {
        String menuChoice = "Yes";
        ArrayList<Employee> employeesInvolved = new ArrayList <>();

        while("Yes".equalsIgnoreCase(menuChoice)){
            int idInvolved = Console.getInt("Enter ID of employee you would like to delete from incident: ");
            Employee employeeInvolved = EmployeeWareHouse.getEmployeeById(idInvolved);
            employeesInvolved.add(employeeInvolved);
            menuChoice = Console.getString("Would you like to delete another employee from the incident?: 'Yes' or 'No'");
        }

        this.incident.getEmployeesInvolved().removeAll(employeesInvolved);
    }

    public void updateIncidentDescription() {
        this.incident.setDescription(Console.getString("Enter new description: "));
    }

    public void updateIncidentDate() {
        this.incident.setDate(Console.getString("Enter new date: "));
        Console.goBack(IncidentsMenu.INSTANCE);
    }

    @Override
    public String toString() {
        String output =
                "1) Add Employee Involved\n" +
                "2) Remove Employee Involved\n" +
                "3) Edit Description\n" +
                "4) Edit Date\n" +
                "5) Edit Id\n" +
                "6) Back\n" +
                "7) Quit\n";
        return output;
    }
}
