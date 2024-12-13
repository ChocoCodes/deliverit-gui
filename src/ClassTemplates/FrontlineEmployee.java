package ClassTemplates;

import LogisticsUI.FrontlineEmployeeUI;

public class FrontlineEmployee extends Employee {
    private final String FRONTLINE_PASS = "frontline123";

    public FrontlineEmployee(String name) {
        super(name);
    }

    @Override
    public boolean login(String pass) {
        return FRONTLINE_PASS.equals(pass);
    }
    
    @Override
    public void showMenu() {
        new FrontlineEmployeeUI().setVisible(true);
    }
}
