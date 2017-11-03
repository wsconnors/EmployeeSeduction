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
        Console.print("Employee has been deleted.\n( ° ͜ʖ͡°)╭∩╮\n");
        EmployeeDirectoryMenu.INSTANCE.display();
    }
}
