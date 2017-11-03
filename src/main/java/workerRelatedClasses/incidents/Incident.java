package workerRelatedClasses.incidents;

import workerRelatedClasses.Employee.Employee;

import java.util.ArrayList;

public class Incident {

    private static ArrayList<Employee> employeesInvolved = new ArrayList <>();
    private static String description;
    private static String date;
    private static int id = 0;

    static int instanceCounter = 0;

    public Incident(ArrayList<Employee> employeesInvolved, String description, String date) {
        this.employeesInvolved = employeesInvolved;
        this.description = description;
        this.date = date;

        instanceCounter++;
        id = instanceCounter;
    }

    public void addEmployee(Employee employee){
        employeesInvolved.add(employee);

    }

    public ArrayList <Employee> getEmployeesInvolved() {
        return employeesInvolved;
    }

    //Takes a new ArrayList to overwrite the current
    public void setEmployeesInvolved(ArrayList <Employee> employeesInvolved) {
        this.employeesInvolved = employeesInvolved;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return this.id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        String output = "workerRelatedClasses.incidents.Incident Number: " + id;
        output += "\nEmployees involved :";
        for(Employee employee : employeesInvolved){
            output += "\n\tName: "+employee.getFirstName()+" "+employee.getLastName()+" ID: "+employee.getId();
        }
        output += "\nDescription: " + description+ "\nDate: " + date + "\n";
        return output;
    }
}
