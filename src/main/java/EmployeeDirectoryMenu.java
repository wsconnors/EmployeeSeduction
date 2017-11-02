public class EmployeeDirectoryMenu extends Menu{
    public static final EmployeeDirectoryMenu INSTANCE = new EmployeeDirectoryMenu();

    enum employeeDirectoryMenu {
        CREATE_EMPLOYEE,
        FIND_EMPLOYEE,
        BACK,
        QUIT}

    public EmployeeDirectoryMenu() {
        super(employeeDirectoryMenu.values());
    }

    @Override
    public void userMenuSelection(String input) {
        switch (employeeDirectoryMenu.valueOf(input)) {
            case CREATE_EMPLOYEE:
                createEmployee();
                break;
            case FIND_EMPLOYEE:
                employeeSelection();
                break;
            case BACK:
                Console.goBack(MainMenu.INSTANCE);
                break;
            case QUIT:
                Console.quitHRApp();
                break;
        }
    }


    private void createEmployee() {
        String newEmployeeFirstName = Console.getString("Please enter the first name of the new employee.");
        String newEmployeeLastName = Console.getString("Please enter the last name of the new employee.");
        String newEmployeePhoneNumber = Console.getString("Please enter the phone number of the new employee.");
        String newEmployeeAddress = Console.getString("Please enter the address of the new employee.");

        Employee aNewEmployee = new Employee(newEmployeeFirstName,
                newEmployeeLastName, newEmployeePhoneNumber, newEmployeeAddress);

        EmployeeWareHouse.addEmployee(aNewEmployee);

    }

    private void employeeSelection() {
        EmployeeSelectionMenu.INSTANCE.display();
    }
}

