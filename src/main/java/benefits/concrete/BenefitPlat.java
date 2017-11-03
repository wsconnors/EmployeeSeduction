package benefits.concrete;

import benefits.BenefitPackage;

public class BenefitPlat extends BenefitPackage {

    //highest benefit package

    private String name = "Platinum Package";

    {   //higher package gets 25 days
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
