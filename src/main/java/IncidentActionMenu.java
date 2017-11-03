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
    public void menuTitle() {
        Console.print(
                "  ______                 _                                      _   _             \n" +
                " |  ____|               | |                           /\\       | | (_)            \n" +
                " | |__   _ __ ___  _ __ | | ___  _   _  ___  ___     /  \\   ___| |_ _  ___  _ __  \n" +
                " |  __| | '_ ` _ \\| '_ \\| |/ _ \\| | | |/ _ \\/ _ \\   / /\\ \\ / __| __| |/ _ \\| '_ \\ \n" +
                " | |____| | | | | | |_) | | (_) | |_| |  __/  __/  / ____ \\ (__| |_| | (_) | | | |\n" +
                " |______|_| |_| |_| .__/|_|\\___/ \\__, |\\___|\\___| /_/    \\_\\___|\\__|_|\\___/|_| |_|\n" +
                "                  | |             __/ |                                           \n" +
                "                  |_|            |___/                                            ");
        Console.print(
                "===========================================================================================");
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
        System.out.println(this.incident.toString());
    }

    @Override
    public String toString() {
        String output =
                "1) Print Employee Information\n" +
                "2) Update\n" +
                "3) Delete\n" +
                "4) Back\n" +
                "5) Quit\n";
        return output;
    }
}

