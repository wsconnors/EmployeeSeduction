import org.junit.Assert;
import org.junit.Test;
import workerRelatedClasses.Employee.Employee;
import workerRelatedClasses.Employee.EmployeeWareHouse;

import java.util.ArrayList;

public class EmployeeWareHouseTest {
    Employee employee = new Employee("billy","bob", "123", "Home");

    @Test       // test getEmployeeList
    public void addEmployeeTest(){
        EmployeeWareHouse.clearEmployees();
        String expected = "billy";

        EmployeeWareHouse.addEmployee(employee);
        ArrayList employeeList = EmployeeWareHouse.getEmployeeList();
        Employee firstEmployee = (Employee)employeeList.get(0);
        String actual = firstEmployee.getFirstName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getEmployeeByIdTest(){
        EmployeeWareHouse.clearEmployees();
        String expected = "billy";
        EmployeeWareHouse.addEmployee(employee);
        int employeeId = employee.getId();

        Employee pullEmployee = EmployeeWareHouse.getEmployeeById(employeeId);

        String actual = pullEmployee.getFirstName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getEmployeeByFirstNameTest(){
        EmployeeWareHouse.clearEmployees();
        String expected = "bob";
        EmployeeWareHouse.addEmployee(employee);

        Employee pullEmployee = EmployeeWareHouse.getEmployeeByFirstName("billy");
        String actual = pullEmployee.getLastName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getEmployeeByLastNameTest(){
        EmployeeWareHouse.clearEmployees();
        String expected = "billy";
        EmployeeWareHouse.addEmployee(employee);

        Employee pullEmployee = EmployeeWareHouse.getEmployeeByLastName("bob");
        String actual = pullEmployee.getFirstName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeEmployeeTest(){
        EmployeeWareHouse.clearEmployees();
        String expected1 = "billy";
        Employee expected2 = null;
        EmployeeWareHouse.addEmployee(employee);
        int employeeId = employee.getId();

        String actual1 = EmployeeWareHouse.getEmployeeById(employeeId).getFirstName();
        EmployeeWareHouse.removeEmployee(employee);
        Employee actual2 = EmployeeWareHouse.getEmployeeById(employeeId);

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
    }

    @Test
    public void clearEmployeeTest(){
        EmployeeWareHouse.clearEmployees();
        int expected = 0;

        EmployeeWareHouse.addEmployee(employee);
        EmployeeWareHouse.clearEmployees();

        int actual = EmployeeWareHouse.getEmployeeList().size();

        Assert.assertEquals(expected,actual);
    }
}
