public class EmployeeSelectionMenu extends Menu{
    public static final EmployeeSelectionMenu INSTANCE = new EmployeeSelectionMenu();

    enum employeeSelectionEnum {
        FIND_BY_ID,
        FIND_BY_LAST_NAME,
        FIND_BY_DEPARTMENT,
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
                findByEmployeeLastname();
                break;
            case FIND_BY_DEPARTMENT:
                findByEmployeeDepartment();
                break;
            case BACK:
                Console.goBack(EmployeeDirectoryMenu.INSTANCE);
                break;
        }
    }

    public void findByEmployeeId() {
        Employee aEmployee = askForEmployeeId();
        aEmployee = checkEmployeeExistence(aEmployee, "Id number");
        EmployeeActionMenu aActionMenu = new EmployeeActionMenu(aEmployee);
        aActionMenu.display();
    }

    public Employee askForEmployeeId() {
        int employee = Console.getInt("Incorrect Id number. Please enter employee's  Id number.");
        Employee aEmployee = EmployeeWareHouse.getEmployeeById(employee);
        return aEmployee;
    }

    public void findByEmployeeLastname() {
        Employee aEmployee = askForEmployeeLastName();
        aEmployee = checkEmployeeExistence(aEmployee, "last name");
        EmployeeActionMenu aActionMenu = new EmployeeActionMenu(aEmployee);
        aActionMenu.display();
    }

    public Employee askForEmployeeLastName() {
        String employee = Console.getString("Incorrect last name. Please enter employee's  last name.");
        Employee aEmployee = EmployeeWareHouse.getEmployeeByLastName(employee);
        return aEmployee;
    }

    public void findByEmployeeDepartment() {
        Employee aEmployee = askForEmployeeDepartment();
        aEmployee = checkEmployeeExistence(aEmployee, "department");
        EmployeeActionMenu aActionMenu = new EmployeeActionMenu(aEmployee);
        aActionMenu.display();
    }

    public Employee askForEmployeeDepartment() {
        String employee = Console.getString("Incorrect department. Please enter employee's  department.");
        Employee aEmployee = EmployeeWareHouse.getEmployeeByDepartment(employee);
        return aEmployee;
    }

    public Employee checkEmployeeExistence(Employee aEmployee, String checkType) {
        while (aEmployee == null) {
            if ("Id number".equalsIgnoreCase(checkType)) {
                askForEmployeeId();
            } else if ("last name".equalsIgnoreCase(checkType)) {
                askForEmployeeLastName();
            } else if ("department".equalsIgnoreCase(checkType)) {
                askForEmployeeDepartment();
            }
        }

        return aEmployee;
    }
}

