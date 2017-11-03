public class EmployeeDirectoryMenu extends Menu {
    public static final EmployeeDirectoryMenu INSTANCE = new EmployeeDirectoryMenu();

    enum employeeDirectoryMenu {
        CREATE_EMPLOYEE,
        FIND_EMPLOYEE,
        BACK,
        QUIT
    }

    public EmployeeDirectoryMenu() {
        super(employeeDirectoryMenu.values());
    }

    @Override
    public void menuTitle() {
        Console.print(
                "  ______                 _                         _____  _               _                   \n" +
                " |  ____|               | |                       |  __ \\(_)             | |                  \n" +
                " | |__   _ __ ___  _ __ | | ___  _   _  ___  ___  | |  | |_ _ __ ___  ___| |_ ___  _ __ _   _ \n" +
                " |  __| | '_ ` _ \\| '_ \\| |/ _ \\| | | |/ _ \\/ _ \\ | |  | | | '__/ _ \\/ __| __/ _ \\| '__| | | |\n" +
                " | |____| | | | | | |_) | | (_) | |_| |  __/  __/ | |__| | | | |  __/ (__| || (_) | |  | |_| |\n" +
                " |______|_| |_| |_| .__/|_|\\___/ \\__, |\\___|\\___| |_____/|_|_|  \\___|\\___|\\__\\___/|_|   \\__, |\n" +
                "                  | |             __/ |                                                  __/ |\n" +
                "                  |_|            |___/                                                  |___/ ");
        Console.print(
                "========================================================================================================");
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

        String addMoreInfo = Console.getString(
                "Would you like to add Salary, Benefits, Department, " +
                "and Position to this employee? 'Yes' or 'No'");

        if ("Yes".equalsIgnoreCase(addMoreInfo)) {
            double newEmployeeSalary = Console.getDouble("Please enter the salary of the new employee?");
            aNewEmployee.setSalary(newEmployeeSalary);

            String newIsEmployeeSalaryOrWage = Console.getString("Is the employee Salary or Wage? 'true' 'false'");
            aNewEmployee.setIsSalary(Boolean.parseBoolean(newIsEmployeeSalaryOrWage));
            
            aNewEmployee.setBenefitPackage(new BenefitSilver());
            EmployeeUpdateMenu.INSTANCE.setSelectedEmployee(aNewEmployee);
            EmployeeUpdateMenu.INSTANCE.updateBenefits();
            EmployeeUpdateMenu.INSTANCE.updateDepartment();

            String newEmployeePosition = Console.getString("Please enter the address of the new employee.");
            aNewEmployee.setPosition(newEmployeePosition);
        }

        Console.print(aNewEmployee.toString());
        EmployeeWareHouse.addEmployee(aNewEmployee);

    }

    private void employeeSelection() {
        EmployeeSelectionMenu.INSTANCE.display();
    }

    @Override
    public String toString() {
        String enumStrings =
                "1) Create Employee,\n" +
                "2) Find Employee,\n" +
                "3) Back,\n" +
                "4) Quit";
        return enumStrings;
    }

}

