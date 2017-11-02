public class EmployeeSelectionMenu extends Menu{
    public static final EmployeeSelectionMenu INSTANCE = new EmployeeSelectionMenu();

    enum employeeSelectionEnum {
        FIND_BY_ID,
        FIND_BY_LAST_NAME,
        BACK,
        QUIT}

    public EmployeeSelectionMenu() {
        super(employeeSelectionEnum.values());
    }

    @Override
    public void userMenuSelection(String input) {
        switch (employeeSelectionEnum.valueOf(input)) {
            case FIND_BY_ID:
                findByEmployeeId();
                break;
            case FIND_BY_LAST_NAME:
                findByEmployeeLastName();
                break;
            case BACK:
                Console.goBack(EmployeeDirectoryMenu.INSTANCE);
                break;
        }
    }

    public void findByEmployeeId() {
        Employee aEmployee = askForEmployeeId();
        aEmployee = checkEmployeeExistence(aEmployee, "Id number");
        EmployeeActionMenu.INSTANCE.setSelectedEmployee(aEmployee);
        EmployeeActionMenu.INSTANCE.display();
    }

    public Employee askForEmployeeId() {
        int employee = Console.getInt("Please enter employee's  Id number.");
        Employee aEmployee = EmployeeWareHouse.getEmployeeById(employee);
        return aEmployee;
    }

    public void findByEmployeeLastName() {
        Employee aEmployee = askForEmployeeLastName();
        aEmployee = checkEmployeeExistence(aEmployee, "last name");
        EmployeeActionMenu.INSTANCE.setSelectedEmployee(aEmployee);
        EmployeeActionMenu.INSTANCE.display();
    }

    public Employee askForEmployeeLastName() {
        String employee = Console.getString("Please enter employee's last name.");
        Employee aEmployee = EmployeeWareHouse.getEmployeeByLastName(employee);
        return aEmployee;
    }

    public Employee checkEmployeeExistence(Employee aEmployee, String checkType) {
        while (aEmployee == null) {
            if ("Id number".equalsIgnoreCase(checkType)) {
                Console.print("That employee Id does not exist.\n");
                aEmployee = askForEmployeeId();

            } else if ("last name".equalsIgnoreCase(checkType)) {
                Console.print("That employee last name does not exist.\n");
                aEmployee = askForEmployeeLastName();
            }
        }
        return aEmployee;
    }
}

