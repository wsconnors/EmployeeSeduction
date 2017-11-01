public class EmployeeActionMenu extends Menu {

    enum employeeActionEnums {UPDATE, DELETE, BACK};

    Employee selectedEmployee;

    public EmployeeActionMenu(Employee selectedEmployee) {
        super(employeeActionEnums.values());
        this.selectedEmployee = selectedEmployee;
    }

    @Override
    public void userMenuSelection(String input) {

        switch (employeeActionEnums.valueOf(input)){
            case UPDATE:
                update();
                break;
            case DELETE:
                delete();
                break;
//            case BACK:
//                mainMenu();
//                break;
        }

    }

    private void update() {
        EmployeeUpdateMenu employeeUpdateMenu = new EmployeeUpdateMenu(selectedEmployee);
        employeeUpdateMenu.display();
    }

    private void delete() {
        EmployeeWareHouse.removeEmployee(selectedEmployee);
    }

//    private void mainMenu(){
////        MainMenu mainMenu = new MainMenu();
////        mainMenu.display();
//    }

}
