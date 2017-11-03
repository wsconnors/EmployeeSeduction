import org.junit.Assert;
import org.junit.Test;
import workerRelatedClasses.Employee.Employee;
import workerRelatedClasses.incidents.Incident;

import java.util.ArrayList;

public class IncidentTest {

    Employee testEmployeeOne = new Employee("John", "Jones", "123", "Home");
    Employee testEmployeeTwo = new Employee("Ricky", "Smith", "123", "Home");

    ArrayList <Employee> testArrayList = new ArrayList <>();
    ArrayList <Employee> testArrayListTwo = new ArrayList <>();



    Incident testIncident = new Incident(testArrayList, "fight", "11/01/2017");
    Incident testIncidentTwo = new Incident(testArrayList, "employee seduction", "yesterday");


    @Test
    public void getEmployeesInvolved() {
        testArrayList.add(testEmployeeOne);
        testArrayList.add(testEmployeeTwo);

        ArrayList <Employee> expected = null;
        ArrayList <Employee> actual = testIncident.getEmployeesInvolved();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEmployeesInvolved() {
        testArrayListTwo.add(testEmployeeOne);
        testArrayListTwo.add(testEmployeeTwo);


        testIncident.setEmployeesInvolved(testArrayListTwo);

        ArrayList<Employee> expected = null;
        ArrayList<Employee> actual = testIncident.getEmployeesInvolved();

        Assert.assertEquals(expected,actual);



    }

    @Test
    public void getDescription() {

        String expected = "fight";
        String actual = testIncident.getDescription();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setDescription() {

        testIncident.setDescription("blahblahblah");

        String expected = "blahblahblah";

        String actual = testIncident.getDescription();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDate() {
        String expected = "11/01/2017";
        String actual = testIncident.getDate();

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
        int expected = 2;
        int actual = testIncidentTwo.getId();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void toStringTest(){
        String expected = "workerRelatedClasses.incidents.Incident Number: 2\n" +
                "Employees involved :\n" +
                "\tName: John Jones ID: 256\n" +
                "\tName: Ricky Smith ID: 157\n" +
                "Description: employee seduction\n" +
                "Date: yesterday";
        testArrayList.add(testEmployeeOne);
        testArrayList.add(testEmployeeTwo);

        String actual = testIncident.toString();

        Assert.assertEquals(expected,actual);
    }


}