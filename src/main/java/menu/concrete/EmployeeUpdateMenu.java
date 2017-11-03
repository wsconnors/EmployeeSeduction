package menu.concrete;

import benefits.concrete.BenefitGold;
import benefits.concrete.BenefitPlat;
import benefits.concrete.BenefitSilver;
import menu.Menu;
import utilities.Console;
import workerRelatedClasses.department.Department;
import workerRelatedClasses.Employee.Employee;

public class EmployeeUpdateMenu extends Menu {
    public static final EmployeeUpdateMenu INSTANCE = new EmployeeUpdateMenu();

    enum employeeUpdateEnums {FIRST_NAME, LAST_NAME, ADDRESS, PHONE_NUMBER, SALARY,
        SALARY_OR_HOURLY, BENEFITS, DEPARTMENT, POSITION, BACK, QUIT};
  
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
    public void menuTitle() {
        Console.print(
                "  ______                 _                         _    _           _       _       \n" +
                " |  ____|               | |                       | |  | |         | |     | |      \n" +
                " | |__   _ __ ___  _ __ | | ___  _   _  ___  ___  | |  | |_ __   __| | __ _| |_ ___ \n" +
                " |  __| | '_ ` _ \\| '_ \\| |/ _ \\| | | |/ _ \\/ _ \\ | |  | | '_ \\ / _` |/ _` | __/ _ \\\n" +
                " | |____| | | | | | |_) | | (_) | |_| |  __/  __/ | |__| | |_) | (_| | (_| | ||  __/\n" +
                " |______|_| |_| |_| .__/|_|\\___/ \\__, |\\___|\\___|  \\____/| .__/ \\__,_|\\__,_|\\__\\___|\n" +
                "                  | |             __/ |                  | |                        \n" +
                "                  |_|            |___/                   |_|                        ");
        Console.print("==============================================================================================");

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
            case QUIT:
                Console.quitHRApp();
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

    public void updateBenefits() {
        Console.print("Employee's current benefits package: " + selectedEmployee.getBenefitPackage().getName());
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
        else {
            updateBenefits();
        }
    }

    public void updateDepartment() {
        do {
            Console.print("Employee's current department: " + selectedEmployee.getDepartment());
            String input = Console.getString("Enter new department (Management, Finance, Logistics): ");

            try {
                switch (Department.valueOf(input.toUpperCase())) {
                    case MANAGEMENT:
                        this.selectedEmployee.setDepartment(Department.MANAGEMENT);
                        break;
                    case FINANCE:
                        this.selectedEmployee.setDepartment(Department.FINANCE);
                        break;
                    case LOGISTICS:
                        this.selectedEmployee.setDepartment(Department.LOGISTICS);
                        break;
                    default:
                        continue;
                }
            } catch (IllegalArgumentException e) {
                Console.print("INVALID INPUT ( ° ͜ʖ͡°)╭∩╮");
                continue;
            }

        } while (true);
    }


    private void updatePosition() {
        Console.print("Employee's current position: " + selectedEmployee.getDepartment());
        this.selectedEmployee.setPosition(Console.getString("Enter a new position: "));
    }
  
    private String printIsSalary(){
        if(selectedEmployee.getIsSalary()){
            return "Is currently Salary.";
        }
        else{
            return "Is currently Hourly";
        }
    }

@Override
    public String toString() {
        String output =
                "1) First Name\n" +
                "2) Last Name\n" +
                "3) Address\n" +
                "4) Phone Number\n" +
                "5) Salary\n" +
                "6) Salary or Hourly\n" +
                "7) Benefits\n" +
                "8) Department\n" +
                "9) Position\n" +
                "10) Back";
        return output;
    }
}
