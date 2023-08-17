public class Main {
    public static void main(String[] args) {
        new Employee(50000);
        var employee = new Employee(50_000, 20);
        /*employee.setBaseSalary();
        employee.setHourlyRate();*/
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}