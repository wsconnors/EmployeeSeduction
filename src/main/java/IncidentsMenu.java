import java.util.ArrayList;

public class IncidentsMenu extends Menu{
    public static final IncidentsMenu INSTANCE = new IncidentsMenu();

    public enum employeeUpdateEnums {CREATE, FIND, BACK, QUIT};

    public IncidentsMenu() {
        super(employeeUpdateEnums.values());
    }

    @Override
    public void userMenuSelection(String input) {

        switch (employeeUpdateEnums.valueOf(input)){
            case CREATE:
                createIncident();
                break;
            case FIND:
                findIncident();
                break;
            case BACK:
                Console.goBack(MainMenu.INSTANCE);
                break;
            case QUIT:
                Console.quitHRApp();
                break;
        }
    }

    private void createIncident() {
        String menuChoice = Console.getString("Would you like to add an employee?: 'Yes' or 'No'");
        ArrayList<Employee> employeesInvolved = new ArrayList <>();

        while("yes".equalsIgnoreCase(menuChoice)){
            int idInvolved = Console.getInt("Enter ID of employee involved: ");
            Employee employeeInvolved = EmployeeWareHouse.getEmployeeById(idInvolved);
            if(employeeInvolved == null){
                System.out.println("Employee does not exist.");
                continue;
            }
            employeesInvolved.add(employeeInvolved);
            menuChoice = Console.getString("Would you like to add another employee?: 'Yes' or 'No'");
        }
        
        String description = Console.getString("Please enter a description: ");
        String date = Console.getString("Please enter a date: ");

        Incident newIncident = new Incident(employeesInvolved, description, date);
        IncidentWareHouse.addIncident(newIncident);
        System.out.println("New incident ID: " + newIncident.getId());
        IncidentsMenu.INSTANCE.display();
    }

    private void findIncident(){
        int ID = Console.getInt("Enter incident ID number: ");
        Incident aIncident = IncidentWareHouse.getIncidentById(ID);
        if(aIncident == null){
            Console.print("Incident does not exist.\n");
            IncidentsMenu.INSTANCE.display();
        }
        IncidentActionMenu.INSTANCE.setIncident(aIncident);
        IncidentActionMenu.INSTANCE.display();
    }
}

