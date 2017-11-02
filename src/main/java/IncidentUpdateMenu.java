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
}
