package workerRelatedClasses.incidents;

import java.util.ArrayList;

public class IncidentWareHouse {

    private static ArrayList<Incident> incidentsReport = new ArrayList <>();

    public static void addIncident(Incident newincident){
        incidentsReport.add(newincident);
    }

    public static ArrayList<Incident> getIncidents(){

        return incidentsReport;
    }

    public static Incident getIncidentById(int id){

        for(Incident incident : incidentsReport){
            if(id == incident.getId()){
                return incident;
            }
        } return null;
    }
}
