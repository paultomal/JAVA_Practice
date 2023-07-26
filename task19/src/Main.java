public class Main {
    public static void main(String[] args) {
        // Referring static method
        Calculator add = Arithmetic::add;
        // Calling interface method
        System.out.println(add.calculate(5,2));

        Calculator sub = Arithmetic::sub;
        System.out.println(sub.calculate(5,2));

    }
}