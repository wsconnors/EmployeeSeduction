public class EmployeeUpdateMenu extends Menu {
    public static final EmployeeUpdateMenu INSTANCE = new EmployeeUpdateMenu();

    enum employeeUpdateEnums {
        FIRST_NAME, LAST_NAME, ADDRESS, PHONE_NUMBER, SALARY,
        SALARY_OR_HOURLY, BENEFITS, DEPARTMENT, POSITION, BACK
    }

    ;

    private Employee selectedEmployee;

    public Employee getSelectedEmployee() {
        return selectedEmployee;
    }

    public void setSelectedEmployee(Employee selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
    }

    public EmployeeUpdateMenu() {
        super(employeeUpdateEnums.values());
    }

    @Override
    public void userMenuSelection(String input) {


        switch (employeeUpdateEnums.valueOf(input)) {
            case FIRST_NAME:
                updateFirstName();
                break;
            case LAST_NAME:
                updateLastName();
                break;
            case ADDRESS:
                updateAddress();
                break;
            case PHONE_NUMBER:
                updatePhoneNumber();
                break;
            case SALARY:
                updateSalary();
                break;
            case SALARY_OR_HOURLY:
                updateSalaryOrHourly();
                break;
            case BENEFITS:
                updateBenefits();
                break;
            case DEPARTMENT:
                updateDepartment();
                break;
            case POSITION:
                updatePosition();
                break;
            case BACK:
                Console.goBack(EmployeeActionMenu.INSTANCE);
                break;
        }

    }

    public void updateAddress() {
        Console.print("Employee's current address: " + selectedEmployee.getAddress());
        this.selectedEmployee.setAddress(Console.getString("Enter new address: "));
    }

    public void updateLastName() {
        Console.print("Employee's current last name: " + selectedEmployee.getLastName());
        this.selectedEmployee.setLastName(Console.getString("Enter new last name: "));
    }

    public void updateFirstName() {
        Console.print("Employee's current first name: " + selectedEmployee.getFirstName());
        this.selectedEmployee.setFirstName(Console.getString("Enter new first name: "));
    }

    private void updatePhoneNumber() {
        Console.print("Employee's current phone #: " + selectedEmployee.getPhoneNumber());
        this.selectedEmployee.setPhoneNumber(Console.getString("Enter new phone number: "));
    }

    private void updateSalary() {
        Console.print("Emplyoyee's current salary: " + selectedEmployee.getSalary());
        this.selectedEmployee.setSalary(Console.getDouble("Enter a new salary amount: "));
    }

    private void updateSalaryOrHourly() {
        Console.print(printIsSalary());
        String input = Console.getString("Salary or Hourly? ");

        if ("Salary".equalsIgnoreCase(input)) {
            this.selectedEmployee.setIsSalary(true);
        } else if ("Hourly".equalsIgnoreCase(input)) {
            this.selectedEmployee.setIsSalary(false);
        } else {
            Console.print("!!!ERROR!!!");
        }
    }

    private void updateBenefits() {
        Console.print("Employee's current benefits package: " + selectedEmployee.getBenefitPackage().printName());
        String input = Console.getString("Enter new benefits package(SILVER/GOLD/PLATINUM): ");

        if ("silver".equalsIgnoreCase(input)) {
            BenefitSilver silver = new BenefitSilver();
            this.selectedEmployee.setBenefitPackage(silver);
        } else if ("gold".equalsIgnoreCase(input)) {
            BenefitGold gold = new BenefitGold();
            this.selectedEmployee.setBenefitPackage(gold);
        } else if ("platinum".equalsIgnoreCase(input)) {
            BenefitPlat platinum = new BenefitPlat();
            this.selectedEmployee.setBenefitPackage(platinum);
        }
    }

    private void updateDepartment() {
        Console.print("Employee's current department: " + selectedEmployee.getDepartment());
        String input = Console.getString("Enter new department: ");

        switch (Department.valueOf(input)) {
            case MANAGEMENT:
                this.selectedEmployee.setDepartment(Department.MANAGEMENT);
                break;
            case FIANCE:
                this.selectedEmployee.setDepartment(Department.FIANCE);
                break;
            case LOGISTICS:
                this.selectedEmployee.setDepartment(Department.FIANCE);
                break;
            default:
               Console.print("!!!ERROR!!!");
        }
    }

    private void updatePosition() {
        Console.print("Employee's current position: " + selectedEmployee.getDepartment());
        this.selectedEmployee.setPosition(Console.getString("Enter a new position: "));
    }

    private String printIsSalary(){
        if(selectedEmployee.getIsSalary()){
            return "Salary";
        }
        else{
            return "Hourly";
        }
    }


}
