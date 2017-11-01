import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

public class EmployeeTest {

    Employee employee1 = new Employee(123,"billy","lastName");
    Employee employee2 = new Employee(321,"bob","lastName");

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
//        ArrayList<Employee> involved = new ArrayList<Employee>();
//        involved.add(employee1);
//        involved.add(employee2);
//        Incident incident = new Incident(now,expected,involved);
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

        int actual = employee1.getBenefitPackage().paidTimeOffInDays;

        System.out.println(employee1.getBenefitPackage().printHealthInsurance());

        Assert.assertEquals(expected,actual);

    }

}
