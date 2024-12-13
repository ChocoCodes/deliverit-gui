package ClassTemplates;

import LogisticsUI.DriverUI;

public class Driver extends Employee {
    private final String DRIVER_PASS = "driver123";

    public Driver(String name) {
        super(name);
    }

    @Override
    public boolean login(String pass) {
        return DRIVER_PASS.equals(pass);
    }
    
    @Override
    public void showMenu() {
        new DriverUI().setVisible(true);
    }    
}
