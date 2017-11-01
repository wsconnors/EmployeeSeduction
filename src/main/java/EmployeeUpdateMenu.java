public class EmployeeUpdateMenu extends Menu {

    enum employeeUpdateEnums {FIRST_NAME, LAST_NAME, ADDRESS, PHONE_NUMBER, SALARY, SALARY_OR_HOURLY, BENEFITS, DEPARTMENT, POSITION, BACK};

    Employee selectedEmployee;

    public EmployeeUpdateMenu(Employee selectedEmployee) {
        super(employeeUpdateEnums.values());
        this.selectedEmployee = selectedEmployee;
    }

    @Override
    public void userMenuSelection(String input) {

        switch (employeeUpdateEnums.valueOf(input)){
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
//            case BACK:
//                mainMenu();
//                break;
        }

    }

    public void updateAddress() {
         selectedEmployee.setAddress(Console.getString("Enter new address: "));
    }

    public void updateLastName() {
        selectedEmployee.setLastName(Console.getString("Enter new last name: "));
    }

    public void updateFirstName() {
        selectedEmployee.setFirstName(Console.getString("Enter new first name: "));
    }

    private void updatePhoneNumber(){
        selectedEmployee.setPhoneNumber(Console.getString("Enter new first name: "));
    }

    private void updateSalary(){
        selectedEmployee.setSalary(Console.getDouble("Enter a new salary amount: "));
    }

    private void updateSalaryOrHourly(){
        String input = Console.getString("Salary or Hourly? ");
        //needs if statement to set true or false
        if("Salary".equalsIgnoreCase(input)){
            selectedEmployee.setIsSalary(true);
        }
        else if("Hourly".equalsIgnoreCase(input)){
            selectedEmployee.setIsSalary(false);
        }
        else{
            //ERROR
        }
    }

    private void updateBenefits(){
        String input = Console.getString("Enter new benefits package(SILVER/GOLD/PLATINUM): ");

        if("silver".equalsIgnoreCase(input)){
            BenefitSilver silver = new BenefitSilver();
            selectedEmployee.setBenefitPackage(silver);
        }
        else if("gold".equalsIgnoreCase(input)){
            BenefitGold gold = new BenefitGold();
            selectedEmployee.setBenefitPackage(gold);
        }
        else if("platinum".equalsIgnoreCase(input)){
            BenefitPlat platinum = new BenefitPlat();
            selectedEmployee.setBenefitPackage(platinum);
        }
    }

    private void updateDepartment(){
        String input = Console.getString("Enter new department: ");

        switch (Department.valueOf(input)){
            case MANAGEMENT:
                selectedEmployee.setDepartment(Department.MANAGEMENT);
                break;
            case FIANCE:
                selectedEmployee.setDepartment(Department.FIANCE);
                break;
            case LOGISTICS:
                selectedEmployee.setDepartment(Department.FIANCE);
                break;
            default:
                //ERROR
        }
    }

    private void updatePosition(){
        selectedEmployee.setPosition(Console.getString("Enter a new position: "));
    }

//    private void mainMenu(){
//        MainMenu mainMenu = new MainMenu();
//        MainMenu.display();
//    }
}
