import annotation.Checker;

public class Employee {

    private String name;

    @Checker
    public String getName() {
        return name;
    }

    @Checker
    public void setName(String name) {
        this.name = name;
    }
}
