import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class IncidentTest {

    Employee testEmployeeOne = new Employee(123,"billy","bob");
    Employee testEmployeeTwo = new Employee(123,"lilly","lob");

    ArrayList <Employee> testArrayList = new ArrayList <>();
    ArrayList <Employee> testArrayListTwo = new ArrayList <>();



    Incident testIncident = new Incident(testArrayList, "fight", "11/01/2017");
    Incident testIncidentTwo = new Incident(testArrayList, "asdf", "asdfasdf");


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


}