import org.junit.Assert;
import org.junit.Test;
import workerRelatedClasses.Employee.Employee;
import workerRelatedClasses.incidents.Incident;
import workerRelatedClasses.incidents.IncidentWareHouse;

import java.util.ArrayList;

public class IncidentWareHouseTest {

    Employee testEmployeeOne = new Employee("Richard", "Dick", "123", "Home");
    ArrayList <Employee> employeesInvolvedTest = new ArrayList <>();

    Incident testIncident = new Incident(employeesInvolvedTest, "fight", "11/01/2017");



    @Test
    public void addIncidentTest() {

        IncidentWareHouse.addIncident(testIncident);

        String expected = "fight";
        String actual = testIncident.getDescription();

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

        String expected = incidentArrayList.get(0).getDescription();
        int incidentId = testIncident.getId();

        String actual = IncidentWareHouse.getIncidentById(incidentId).getDescription();

        Assert.assertEquals(expected,actual);
    }


}