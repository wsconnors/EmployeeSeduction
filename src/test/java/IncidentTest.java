import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class IncidentTest {

    Employee testEmployeeOne = new Employee("John", "Jones", "123", "Home");
    Employee testEmployeeTwo = new Employee("Ricky", "Smith", "123", "Home");

    ArrayList <Employee> testArrayList = new ArrayList <>();
    ArrayList <Employee> testArrayListTwo = new ArrayList <>();



    Incident testIncident = new Incident(testArrayList, "fight", "11/01/2017");
   // Incident testIncidentTwo = new Incident(testArrayList, "fight", "asdfasdf");


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


        testIncident.setEmployeesInvolved(testArrayList);

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
        int expected = 1;
        int actual = testIncident.getId();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void toStringTest(){
        String expected = "Incident Number: 2\n" +
                "Employees involved :\n" +
                "\tName: John Jones ID: 1\n" +
                "\tName: Ricky Smith ID: 2\n" +
                "Description: asdf\n" +
                "Date: asdfasdf";
        testArrayList.add(testEmployeeOne);
        testArrayList.add(testEmployeeTwo);

        String actual = testIncident.toString();

        Assert.assertEquals(expected,actual);
    }


}