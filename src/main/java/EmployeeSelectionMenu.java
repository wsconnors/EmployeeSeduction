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
    public void menuTitle() {
        Console.print(
                "  ______                 _                          _____      _           _   _             \n" +
                " |  ____|               | |                        / ____|    | |         | | (_)            \n" +
                " | |__   _ __ ___  _ __ | | ___  _   _  ___  ___  | (___   ___| | ___  ___| |_ _  ___  _ __  \n" +
                " |  __| | '_ ` _ \\| '_ \\| |/ _ \\| | | |/ _ \\/ _ \\  \\___ \\ / _ \\ |/ _ \\/ __| __| |/ _ \\| '_ \\ \n" +
                " | |____| | | | | | |_) | | (_) | |_| |  __/  __/  ____) |  __/ |  __/ (__| |_| | (_) | | | |\n" +
                " |______|_| |_| |_| .__/|_|\\___/ \\__, |\\___|\\___| |_____/ \\___|_|\\___|\\___|\\__|_|\\___/|_| |_|\n" +
                "                  | |             __/ |                                                      \n" +
                "                  |_|            |___/                                                       ");
        Console.print("" +
                "========================================================================================================");
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

