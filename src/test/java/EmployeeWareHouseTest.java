import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class EmployeeWareHouseTest {
    Employee employee = new Employee("billy","bob", "123", "Home");

    @Test       // test getEmployeeList
    public void addEmployeeTest(){
        EmployeeWareHouse.clearEmployees();
        int expected = 123;

        EmployeeWareHouse.addEmployee(employee);
        ArrayList employeeList = EmployeeWareHouse.getEmployeeList();
        Employee firstEmployee = (Employee)employeeList.get(0);
        int actual = firstEmployee.getId();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getEmployeeByIdTest(){
        EmployeeWareHouse.clearEmployees();
        String expected = "billy";
        EmployeeWareHouse.addEmployee(employee);

        Employee pullEmployee = EmployeeWareHouse.getEmployeeById(123);
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
        int expected = 123;
        EmployeeWareHouse.addEmployee(employee);

        Employee pullEmployee = EmployeeWareHouse.getEmployeeByLastName("bob");
        int actual = pullEmployee.getId();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeEmployeeTest(){
        EmployeeWareHouse.clearEmployees();
        int expected1 = 123;
        Employee expected2 = null;
        EmployeeWareHouse.addEmployee(employee);
        int actual1 = EmployeeWareHouse.getEmployeeById(123).getId();

        EmployeeWareHouse.removeEmployee(employee);
        Employee actual2 = EmployeeWareHouse.getEmployeeById(123);

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
    }
}
