public class BenefitPlat extends BenefitPackage {

    //highest benefit package

    private String name = "Platinum Package";

    {   //higher package gets 25 days/5 weeks
        paidTimeOffInDays = 25;

        healthInsurance = true;

        retirementPlan = true;
    }

    public BenefitPlat(){

        super();
    }

    public String getName() {
        return name;
    }


}
