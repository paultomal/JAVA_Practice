public class Main {
    public static void main(String[] args) {
       Employee e1 = new Employee("Paul", "Intern","1" );
        Employee e2 = new Employee("John Doe", "101");
        Employee e3 = new Employee("Bob Johnson");


        System.out.println( e1.getEmployeeId());
        System.out.println( e2.getEmployeeId());
        System.out.println( e3.getName());
    }
}