package ClassTemplates;

import LogisticsUI.WarehouseManagerUI;

public class WarehouseManager extends Employee {
    private static final String WAREHOUSE_MAN_PASS = "warehouse123";

    public WarehouseManager(String name) {
        super(name);
    }

    @Override
    public boolean login(String pass) {
        return WAREHOUSE_MAN_PASS.equals(pass);
    }

    @Override
    public void showMenu() {
        new WarehouseManagerUI().setVisible(true);
    }
}
