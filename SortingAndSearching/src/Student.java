import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private int stdId;
    private String name;
    private int age;
    public Student(){}

    public Student(int stdId, String name, int age) {
        this.stdId = stdId;
        this.name = name;
        this.age = age;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return age - o.age;
    }
}
