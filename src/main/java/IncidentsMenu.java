import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class IncidentsMenu extends Menu{

    enum employeeUpdateEnums {CREATE, FIND, BACK};

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
//            case BACK:
//                mainMenu();
        }
    }

    private void createIncident() {
        String menuChoice = Console.getString("Would you like to add an employee? ");
        ArrayList<Employee> employeesInvolved = new ArrayList <>();

        while(!"No".equalsIgnoreCase(menuChoice)){
            int idInvolved = Console.getInt("Enter ID of employee involved: ");
            Employee employeeInvolved = EmployeeWareHouse.getEmployeeById(idInvolved);
            employeesInvolved.add(employeeInvolved);
            menuChoice = Console.getString("Would you like to add another employee? ");
        }

        String description = Console.getString("Please enter a description: ");
        String date = Console.getString("Please enter a date: ");


        Incident newIncident = new Incident(employeesInvolved, description, date);
        IncidentWareHouse.addIncident(newIncident);

    }

    private void findIncident(){
        int ID = Console.getInt("Enter incident ID number: ");
        IncidentWareHouse.getIncidentById(ID).toString();


    }




//    private void mainMenu(){
//        MainMenu mainMenu = new MainMenu();
//    }


}
