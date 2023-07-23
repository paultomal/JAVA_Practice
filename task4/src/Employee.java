public class Employee {
     private String name;
     private String department;
     private String employeeId;
    public Employee(String name, String employeeId) {
        setName(name);
        setEmployeeId(employeeId);
    }
    public Employee(String name,String department, String employeeId){
       setName(name);
        setDepartment(department);
        setEmployeeId(employeeId);
    }
    public Employee(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
