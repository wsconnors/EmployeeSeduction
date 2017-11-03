package menu.concrete;

import menu.Menu;
import utilities.Console;
import workerRelatedClasses.incidents.Incident;

public class IncidentActionMenu extends Menu {
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
                "  _____            _     _            _     _    _           _       _       \n" +
                " |_   _|          (_)   | |          | |   | |  | |         | |     | |      \n" +
                "   | |  _ __   ___ _  __| | ___ _ __ | |_  | |  | |_ __   __| | __ _| |_ ___ \n" +
                "   | | | '_ \\ / __| |/ _` |/ _ \\ '_ \\| __| | |  | | '_ \\ / _` |/ _` | __/ _ \\\n" +
                "  _| |_| | | | (__| | (_| |  __/ | | | |_  | |__| | |_) | (_| | (_| | ||  __/\n" +
                " |_____|_| |_|\\___|_|\\__,_|\\___|_| |_|\\__|  \\____/| .__/ \\__,_|\\__,_|\\__\\___|\n" +
                "                                                  | |                        \n" +
                "                                                  |_|                        ");
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
        Console.print(this.incident.toString());
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

