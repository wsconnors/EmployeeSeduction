import org.junit.Assert;
import org.junit.Test;

public class BenefitSilverTest {



    BenefitSilver benefitSilverTestObj = new BenefitSilver();

    @Test
    public void getNameTest() {
        String expected = "Silver Package";
        String actual = benefitSilverTestObj.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paidTimeOffInDaysTest() {
        int expected = 15;
        int actual = benefitSilverTestObj.paidTimeOffInDays;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void healthInsuranceTest() {
        boolean expected = false;
        boolean actual = benefitSilverTestObj.healthInsurance;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void retirementPlanTest() {
        boolean expected = false;
        boolean actual = benefitSilverTestObj.retirementPlan;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printPaidTimeOffInDaysTest(){
        String exected = "PTO Days: 15";
        String actual = benefitSilverTestObj.printPaidTimeOffInDays();

        Assert.assertEquals(exected,actual);
    }
    @Test
    public void printHealthInsuranceTest(){
        String exected = "Has Health Insurance: false";
        String actual = benefitSilverTestObj.printHealthInsurance();

        Assert.assertEquals(exected,actual);
    }
    @Test
    public void printRetirementPlanTest(){
        String exected = "Has Retirement Plan: false";
        String actual = benefitSilverTestObj.printRetirementPlan();

        Assert.assertEquals(exected,actual);
    }
}