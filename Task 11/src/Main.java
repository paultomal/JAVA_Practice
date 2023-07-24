// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] courses =  {"Mechanics", "Electromagnetism", "Quantum Physics"};
        University.Department myDept = new University.Department("CSE", courses);
        myDept.showDetails();

    }
}