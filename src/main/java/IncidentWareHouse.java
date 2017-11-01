import java.util.ArrayList;

public class IncidentWareHouse {

    private static ArrayList<Incident> incidentreport = new ArrayList <>();


//    public static IncidentWareHouse getInstance(){
//        return theInstance;
//    }


    public static void addIncident(Incident newincident){
        incidentreport.add(newincident);
    }

    public static ArrayList<Incident> getIncidents(){

        return incidentreport;
    }

    public static Incident getIncidentById(int id){

        for(Incident incident : incidentreport){
            if(id == incident.getId()){
                return incident;
            }
        } return null;
    }
//
//    public static Incident getIncidentByEmployee(Employee e){
//        for(Incident incident : incidentreport){
//            for(Employee employee : incident.getEmployeesInvolved()){
//                if(employee == e){
//
//                    return incident;
//                }
//            }
//        }return null;
//
//    }


}
