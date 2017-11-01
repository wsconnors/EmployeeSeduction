import java.util.ArrayList;

public class Employee extends Person{
    private String postion;
    //private Enum department;
    private double Salary;
    private boolean isSalary;
    private ArrayList<TimeCard> timeCardList;
    private ArrayList<incident> incidents;
    private BenefitPackage benefitPackage;

    Employee(){
        super(id,firstName,lastName);
    }
}
