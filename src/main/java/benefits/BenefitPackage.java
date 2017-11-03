package benefits;

public abstract class BenefitPackage {


    protected boolean healthInsurance = false;
    protected boolean retirementPlan = false;
    protected String name;

    //default 3 weeks PTO
    protected int paidTimeOffInDays = 15;


    public BenefitPackage() {

    }

    public boolean isHealthInsurance() {
        return healthInsurance;
    }

    public boolean isRetirementPlan() {
        return retirementPlan;
    }

    public String getName() {
        return name;
    }

    public int getPaidTimeOffInDays() {
        return paidTimeOffInDays;
    }

    public String printPaidTimeOffInDays() {
        String days = "PTO Days: " + paidTimeOffInDays;
        return days;
    }

    public String printHealthInsurance() {
        String hasHealthInsurance = "Has Health Insurance: " + healthInsurance;
        return hasHealthInsurance;
    }

    public String printRetirementPlan() {
        String hasRetirementPlan = "Has Retirement Plan: " + retirementPlan;
        return hasRetirementPlan;
    }
}






