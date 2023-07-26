import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();

        Student s1 = new Student("Paul", 202);
        students.add(s1);

        Student s2 = new Student("Imam", 201);
        students.add(s2);

        boolean found = students.contains(s2);
        if(found){
            System.out.println("Student is in the list");
        }else {
            System.out.println("Student Not Found");
        }

    }
}