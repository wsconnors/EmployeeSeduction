package menu.concrete;

import menu.Menu;
import utilities.Console;
import workerRelatedClasses.Employee.Employee;
import workerRelatedClasses.Employee.EmployeeWareHouse;

public class EmployeeActionMenu extends Menu {
    public static final EmployeeActionMenu INSTANCE = new EmployeeActionMenu();
    private Employee selectedEmployee;

    public Employee getSelectedEmployee() {
        return selectedEmployee;
    }

    public void setSelectedEmployee(Employee selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
    }

    public enum employeeActionEnums {UPDATE, PRINT_INFO, DELETE, BACK};

    public EmployeeActionMenu() {
        super(employeeActionEnums.values());
    }

    @Override
    public void menuTitle() {
        Console.print(
                "  ______                 _                                      _   _             \n" +
                " |  ____|               | |                           /\\       | | (_)            \n" +
                " | |__   _ __ ___  _ __ | | ___  _   _  ___  ___     /  \\   ___| |_ _  ___  _ __  \n" +
                " |  __| | '_ ` _ \\| '_ \\| |/ _ \\| | | |/ _ \\/ _ \\   / /\\ \\ / __| __| |/ _ \\| '_ \\ \n" +
                " | |____| | | | | | |_) | | (_) | |_| |  __/  __/  / ____ \\ (__| |_| | (_) | | | |\n" +
                " |______|_| |_| |_| .__/|_|\\___/ \\__, |\\___|\\___| /_/    \\_\\___|\\__|_|\\___/|_| |_|\n" +
                "                  | |             __/ |                                           \n" +
                "                  |_|            |___/                                            ");
        Console.print(
                "===============================================================================================");
    }

    @Override
    public void userMenuSelection(String input) {

        switch (employeeActionEnums.valueOf(input)){
            case PRINT_INFO:
                Console.print(this.selectedEmployee.toString());
                EmployeeActionMenu.INSTANCE.display();
                break;
            case UPDATE:
                update();
                break;
            case DELETE:
                delete();
                break;
            case BACK:
                Console.goBack(EmployeeSelectionMenu.INSTANCE);
                break;
        }

    }

    private void update() {
        EmployeeUpdateMenu.INSTANCE.setSelectedEmployee(this.selectedEmployee);
        EmployeeUpdateMenu.INSTANCE.display();
    }

    private void delete() {
        EmployeeWareHouse.removeEmployee(this.selectedEmployee);
        Console.print("\n"+this.selectedEmployee.toString());
        Console.print("workerRelatedClasses.Employee.Employee has been deleted.\n( ° ͜ʖ͡°)╭∩╮\n");
        EmployeeDirectoryMenu.INSTANCE.display();
    }

    @Override
    public String toString() {
        String output =
                "1) Update\n" +
                "2) Print workerRelatedClasses.Employee.Employee Information\n" +
                "3) Delete\n" +
                "4) Back";

        return output;
    }
}
