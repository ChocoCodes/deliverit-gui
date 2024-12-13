package ClassTemplates;


public class Employee {
    private final String DEFAULT_PASS = "employee123";

    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public boolean login(String pass) {
        return DEFAULT_PASS.equals(pass);
    }

    public String getName() {
        return name;
    }
}