public class BenefitGold extends BenefitPackage{

    //mid benefit package

    private String name = "Gold Package";

    {   //mid package gets 20 days/ 4 weeks
        paidTimeOffInDays = 20;

        healthInsurance = true;
    }

    public BenefitGold(){

        super();
    }

    public String getName() {
        return name;
    }



}
