import org.junit.Assert;
import org.junit.Test;

public class BenefitGoldTest {

    BenefitGold benefitGoldTestObj = new BenefitGold();

    @Test
    public void getNameTest() {
        String expected = "Gold Package";
        String actual = benefitGoldTestObj.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paidTimeOffInDaysTest() {
        int expected = 20;
        int actual = benefitGoldTestObj.paidTimeOffInDays;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void healthInsuranceTest() {
        boolean expected = true;
        boolean actual = benefitGoldTestObj.healthInsurance;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void retirementPlanTest() {
        boolean expected = false;
        boolean actual = benefitGoldTestObj.retirementPlan;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printPaidTimeOffInDaysTest(){
        String exected = "PTO Days: 20";
        String actual = benefitGoldTestObj.printPaidTimeOffInDays();

        Assert.assertEquals(exected,actual);
    }
    @Test
    public void printHealthInsuranceTest(){
        String exected = "Has Health Insurance: true";
        String actual = benefitGoldTestObj.printHealthInsurance();

        Assert.assertEquals(exected,actual);
    }
    @Test
    public void printRetirementPlanTest(){
        String exected = "Has Retirement Plan: false";
        String actual = benefitGoldTestObj.printRetirementPlan();

        Assert.assertEquals(exected,actual);
    }
}