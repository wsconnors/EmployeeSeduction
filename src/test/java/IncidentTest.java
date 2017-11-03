import org.junit.Assert;
import org.junit.Test;
import workerRelatedClasses.Employee.Employee;
import workerRelatedClasses.incidents.Incident;

import java.util.ArrayList;

public class IncidentTest {

    Employee testEmployeeOne = new Employee("John", "Jones", "123", "Home");
    Employee testEmployeeTwo = new Employee("Ricky", "Smith", "123", "Home");
    Employee testEmployeeThree = new Employee("Billy", "Bob", "123", "Home");

    ArrayList <Employee> testArrayList = new ArrayList <>();
    ArrayList <Employee> testArrayListTwo = new ArrayList <>();



    Incident testIncident = new Incident(testArrayList, "fight", "11/01/2017");
    Incident testIncidentTwo = new Incident(testArrayList, "employee seduction", "yesterday");


    @Test
    public void getEmployeesInvolved() {
        testArrayList.add(testEmployeeOne);
        testArrayList.add(testEmployeeTwo);

        String expected = "John";

        ArrayList <Employee> employeesInvolved = testIncident.getEmployeesInvolved();
        String actual = employeesInvolved.get(0).getFirstName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEmployeesInvolved() {
        testArrayListTwo.add(testEmployeeThree);

        testIncident.setEmployeesInvolved(testArrayListTwo);

        String expected = "Billy";

        ArrayList<Employee> employeesInvolved = testIncident.getEmployeesInvolved();
        String actual = employeesInvolved.get(0).getFirstName();

        Assert.assertEquals(expected,actual);

    }

    @Test       // get and set test
    public void setDescription() {
        String expected = "blahblahblah";

        testIncident.setDescription("blahblahblah");

        String actual = testIncident.getDescription();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setDate() {
        testIncident.setDate("123");

        String expected = "123";
        String actual = testIncident.getDate();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getId() {
        int expected = 6;
        int actual = testIncidentTwo.getId();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void toStringTest(){
        testEmployeeOne.setId(100);
        testEmployeeTwo.setId(200);
        String expected = "Incident Number: 10\n" +
                "Employees involved :\n" +
                "\tName: John Jones ID: 100\n" +
                "\tName: Ricky Smith ID: 200\n" +
                "Description: employee seduction\n" +
                "Date: yesterday\n";
        testArrayList.add(testEmployeeOne);
        testArrayList.add(testEmployeeTwo);

        String actual = testIncident.toString();

        Assert.assertEquals(expected,actual);
    }


}