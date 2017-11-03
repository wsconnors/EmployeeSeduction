import benefits.BenefitPackage;
import benefits.concrete.BenefitSilver;
import org.junit.Assert;
import org.junit.Test;
import workerRelatedClasses.department.Department;
import workerRelatedClasses.Employee.Employee;
import workerRelatedClasses.Employee.TimeCard;

import java.util.Date;

public class EmployeeTest {

    Employee employee1 = new Employee("billy","lastName", "123", "Home");
    Employee employee2 = new Employee("bob","lastName", "123", "Home");

    @Test       // Set and get test
    public void positionTest(){
        String expected = "Manger";
        employee1.setPosition(expected);

        String actual = employee1.getPosition();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void departmentTest(){
        Department management = Department.MANAGEMENT;
        Enum expected = management;

        employee1.setDepartment(management);

        Enum actual = employee1.getDepartment();

        Assert.assertEquals(expected,actual);

    }

    @Test       // Set and get test
    public void salaryTest(){
        double expected = 100;
        employee1.setSalary(100);

        double actual = employee1.getSalary();

        Assert.assertEquals(expected,actual,0);
    }

    @Test       // Set and get test
    public void isSalaryTest(){
        boolean expected = true;
        employee1.setIsSalary(expected);

        boolean actual = employee1.getIsSalary();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void timeCardTest(){
        Date now = new Date();
        TimeCard timeCard = new TimeCard(now);
        int expected = 0;
        int expected1 = 1;

        int actual = employee1.getTimeCardList().size();
        employee1.addTimeCard(timeCard);
        int actual1 = employee1.getTimeCardList().size();

        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected1,actual1);

    }

//    @Test
//    public void incidentTest(){
//        Date now = new Date();
//        String expected = "employee seduction";
//        ArrayList<workerRelatedClasses.Employee.Employee> involved = new ArrayList<workerRelatedClasses.Employee.Employee>();
//        involved.add(employee1);
//        involved.add(employee2);
//        workerRelatedClasses.incidents.Incident incident = new workerRelatedClasses.incidents.Incident(now,expected,involved);
//
//        String actual = incident.getDescription();
//
//        Assert.assertEquals(expected,actual);
//
//    }



    @Test       // Set and get test
    public void getBenefitPackageTest(){
        BenefitPackage bene = new BenefitSilver();
        employee1.setBenefitPackage(bene);

        int expected = 15;

        int actual = employee1.getBenefitPackage().getPaidTimeOffInDays();

        System.out.println(employee1.getBenefitPackage().printHealthInsurance());

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void clockInTest(){
        Date expected = new Date();
        employee1.clockIn();

        Date actual = employee1.getTimeCardList().get(0).getClockIn();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void clockOutTest(){
        employee1.clockIn();
        employee1.clockOut();

        Date expected = new Date();
        Date actual = employee1.getTimeCardList().get(0).getClockOut();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHourlyWageTest(){
        double expected = 10;
        employee1.setSalary(400);
        double actual = employee1.getHourlyWage();

        Assert.assertEquals(expected,actual,0);
    }
}
