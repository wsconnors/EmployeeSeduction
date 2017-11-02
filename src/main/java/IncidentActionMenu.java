public class IncidentActionMenu extends Menu{
    public static final IncidentActionMenu INSTANCE = new IncidentActionMenu();

    private Incident incident;

    public Incident getIncident() {
        return incident;
    }

    public void setIncident(Incident incident) {
        this.incident = incident;
    }

    public enum incidentUpdateEnums {PRINT_INFO, UPDATE, DELETE, BACK, QUIT};

    public IncidentActionMenu() {
        super(IncidentActionMenu.incidentUpdateEnums.values());
    }

    @Override
    public void userMenuSelection(String input) {

        switch (IncidentActionMenu.incidentUpdateEnums.valueOf(input)){
            case PRINT_INFO:
                printIncident();
                break;
            case UPDATE:
                updateIncident();
                break;
            case BACK:
                Console.goBack(IncidentsMenu.INSTANCE);
                break;
            case QUIT:
                Console.quitHRApp();
                break;

        }
    }

    public void updateIncident() {
        IncidentUpdateMenu.INSTANCE.display();
        IncidentUpdateMenu.INSTANCE.setIncident(this.incident);
    }
    public void printIncident() {
        this.incident.toString();
    }
}

