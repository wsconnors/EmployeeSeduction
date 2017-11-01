public abstract class BenefitPackage {

//    protected String healthInsurance;
    protected boolean healthInsurance = false;

//    protected String retirementPlan;
    protected boolean retirementPlan = false;

    //default 3 weeks PTO
    protected int paidTimeOffInDays = 15;

    public BenefitPackage(){

    }

    public String printPaidTimeOffInDays(){
        String days = "PTO Days: " + paidTimeOffInDays;
        return days;
    }

    public String printHealthInsurance(){
        String hasHealthInsurance = "Has Health Insurance: " + healthInsurance;
        return hasHealthInsurance;
    }

    public String printRetirementPlan(){
        String hasRetirementPlan = "Has Retirement Plan: " + retirementPlan;
        return hasRetirementPlan;
    }











    public static void main(String[] args) {

        BenefitSilver benefit = new BenefitSilver();
        BenefitGold benefitGold = new BenefitGold();
        BenefitPlat benefitPlat = new BenefitPlat();

        System.out.println(benefit.getName());
        System.out.println(benefit.printPaidTimeOffInDays());
        System.out.println(benefit.printHealthInsurance());
        System.out.println(benefit.printRetirementPlan() + "\n");


        System.out.println(benefitGold.getName());
        System.out.println(benefitGold.printPaidTimeOffInDays());
        System.out.println(benefitGold.printHealthInsurance());
        System.out.println(benefitGold.printRetirementPlan() + "\n");


        System.out.println(benefitPlat.getName());
        System.out.println(benefitPlat.printPaidTimeOffInDays());
        System.out.println(benefitPlat.printHealthInsurance());
        System.out.println(benefitPlat.printRetirementPlan());







    }

//    public String getHealthInsurance() {
//        return healthInsurance;
//    }
//
//    public void setHealthInsurance(String healthInsurance) {
//        this.healthInsurance = healthInsurance;
//    }
}
