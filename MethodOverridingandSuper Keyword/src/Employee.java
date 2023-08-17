public class Employee {
    private String name;

    private int employeeID;

    private int salary;
    public Employee(String name, int employeeID, int salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "name= " + name +
                ", employeeID= " + employeeID +
                ", salary= " + salary + ", ";
    }
}
