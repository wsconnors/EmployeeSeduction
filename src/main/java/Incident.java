import java.util.ArrayList;

public class Incident {

    private ArrayList<Employee> employeesInvolved = new ArrayList <>();
    private String description;
    private String date;
    private int id = 0;

    static int instanceCounter = 0;

    public Incident(ArrayList<Employee> employeesInvolved,String description, String date) {
        this.employeesInvolved = employeesInvolved;
        this.description = description;
        this.date = date;

        instanceCounter++;
        id = instanceCounter;
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
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
}
