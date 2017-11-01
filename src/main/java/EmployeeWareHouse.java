import java.util.ArrayList;

public class EmployeeWareHouse {

    private static ArrayList<Employee> employeeList = new ArrayList<Employee>();


    public static void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public static ArrayList<Employee> getEmployeeList(){
        return employeeList;
    }

    public static Employee getEmployeeById(int Id){
        for(Employee currentEmployee: employeeList){
            if(currentEmployee.getId() == Id){
                return currentEmployee;
            }
        }
        return null;
    }
    public static Employee getEmployeeByFirstName(String firstName){
        for(Employee currentEmployee: employeeList){
            if(firstName.equalsIgnoreCase(currentEmployee.getFirstName())){
                return currentEmployee;
            }
        }
        return null;
    }

    public static Employee getEmployeeByLastName(String lastName){
        for(Employee currentEmployee: employeeList){
            if(lastName.equalsIgnoreCase(currentEmployee.getLastName())){
                return currentEmployee;
            }
        }
        return null;
    }

    public static void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }

    public static void clearEmployees(){
        employeeList.clear();
    }

}

