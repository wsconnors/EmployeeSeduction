public abstract class BenefitPackage {


    protected boolean healthInsurance = false;
    protected boolean retirementPlan = false;

    //default 3 weeks PTO
    protected int paidTimeOffInDays = 15;


    public BenefitPackage() {

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







