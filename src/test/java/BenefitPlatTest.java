import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BenefitPlatTest {



    BenefitPlat benefitPlatTestObj = new BenefitPlat();

    @Test
    public void getNameTest() {
        String expected = "Platinum Package";
        String actual = benefitPlatTestObj.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paidTimeOffInDaysTest() {
        int expected = 25;
        int actual = benefitPlatTestObj.paidTimeOffInDays;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void healthInsuranceTest() {
        boolean expected = true;
        boolean actual = benefitPlatTestObj.healthInsurance;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void retirementPlanTest() {
        boolean expected = true;
        boolean actual = benefitPlatTestObj.retirementPlan;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printPaidTimeOffInDaysTest(){
        String exected = "PTO Days: 25";
        String actual = benefitPlatTestObj.printPaidTimeOffInDays();

        Assert.assertEquals(exected,actual);
    }
    @Test
    public void printHealthInsuranceTest(){
        String exected = "Has Health Insurance: true";
        String actual = benefitPlatTestObj.printHealthInsurance();

        Assert.assertEquals(exected,actual);
    }
    @Test
    public void printRetirementPlanTest(){
        String exected = "Has Retirement Plan: true";
        String actual = benefitPlatTestObj.printRetirementPlan();

        Assert.assertEquals(exected,actual);
    }
}