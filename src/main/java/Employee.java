import java.util.ArrayList;
import java.util.Date;


public class Employee extends Person {
    private String position;
    private Enum department;
    private double Salary;
    private boolean isSalary;
    private ArrayList <TimeCard> timeCardList = new ArrayList <TimeCard>();
    //    private ArrayList<Incident> incidents;
    private BenefitPackage benefitPackage;

    Employee(String firstName, String lastName, String phoneNumber, String address) {
        super(firstName, lastName, phoneNumber, address);
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Enum getDepartment() {
        return department;
    }

    public void setDepartment(Enum department) {
        this.department = department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public boolean getIsSalary() {
        return isSalary;
    }

    public void setIsSalary(boolean salary) {
        isSalary = salary;
    }

    public ArrayList <TimeCard> getTimeCardList() {
        return timeCardList;
    }

    public void addTimeCard(TimeCard timeCard) {
        timeCardList.add(timeCard);
    }

    public BenefitPackage getBenefitPackage() {
        return benefitPackage;
    }

    public void setBenefitPackage(BenefitPackage benefitPackage) {
        this.benefitPackage = benefitPackage;
    }

    //    public ArrayList<Incident> getIncidents() {
//        return incidents;
//    }
//
//    public void addIncident(Incident incident) {
//        this.incidents.add(incident);
//    }
    public void clockIn() {
        Date now = new Date();
        TimeCard timeCard = new TimeCard(now);
        addTimeCard(timeCard);
    }

    public void clockOut() {
        if (timeCardList.size() > 0) {
            int last = timeCardList.size() - 1;
            TimeCard lastCard = timeCardList.get(last);
            if (lastCard.getClockOut() == null) {
                Date now = new Date();
                lastCard.setClockOut(now);
            }
        }
    }

    public double getHourlyWage() {
        return this.Salary / 40;
    }

    @Override
    public String toString() {
        String output =
                "\nEmployee ID: " + super.getId() +
                "\nName: " + super.getFirstName() + " " + super.getLastName() +
                "\nPhone Number: " + super.getPhoneNumber() +
                "\nAddress: " + super.getAddress() +
                "\nDepartment: " + this.getDepartment() +
                "\nPosition: " + this.getPosition() +
                "\nSalary: " + this.getSalary() +
                "\nBenefit Package: " + this.getBenefitPackage() + "\n";
        return output;
    }
}
