import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class IncidentWareHouseTest {

    Employee testEmployeeOne = new Employee(3, "Richard", "Dick");
    ArrayList <Employee> employeesInvolvedTest = new ArrayList <>();

    Incident testIncident = new Incident(employeesInvolvedTest, "fight", "11/01/2017");








    @Test
    public void addIncidentTest() {

        IncidentWareHouse.addIncident(testIncident);

        int expected = 1;
        int actual = testIncident.getId();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getIncidentsTest() {


        IncidentWareHouse.addIncident(testIncident);

        int expected = 1;
        int actual = IncidentWareHouse.getIncidents().size();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getIncidentByIdTest() {

        IncidentWareHouse.addIncident(testIncident);
        ArrayList<Incident> incidentArrayList = IncidentWareHouse.getIncidents();

        int expected = incidentArrayList.get(0).getId();
        int actual = IncidentWareHouse.getIncidentById(1).getId();

        Assert.assertEquals(expected,actual);
    }

//    @Test
//    public void getIncidentByEmployeeTest() {
//        employeesInvolvedTest.add(testEmployeeOne);
//        ArrayList<Incident> incidentArrayList = IncidentWareHouse.getIncidents();
//
//
//        int expected = 1;
//        int actual = IncidentWareHouse.getIncidentByEmployee(testEmployeeOne).getId();
//
//        Assert.assertEquals(expected,actual);
//
//    }

}