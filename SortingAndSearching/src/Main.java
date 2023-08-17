import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Paul",23));
        students.add(new Student(2,"Paul2",22));
        students.add(new Student(3,"Paul3",25));

        Collections.sort(students); //Sorting
        System.out.println(students);

        //binary search

        System.out.println(Collections.binarySearch(students, new Student(2,"Paul2",22)));
    }
}