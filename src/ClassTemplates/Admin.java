package ClassTemplates;

public class Admin extends Employee {
    private final String ADMIN_PASS = "admin123";

    public Admin(String name) {
        super(name);
    }

    @Override
    public boolean login(String pass) {
        return ADMIN_PASS.equals(pass);
    }
}