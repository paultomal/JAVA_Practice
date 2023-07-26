import java.io.Serializable;

public class Employee implements Serializable {
    public Employee(){

    }
    private String name;
    private int age;
    private int salary;
    public Employee(String name,int age,int salary){
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
