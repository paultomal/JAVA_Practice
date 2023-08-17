public class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeID, int salary, String department) {
        super(name, employeeID, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString()  + "Department= "+ department;
    }
}
