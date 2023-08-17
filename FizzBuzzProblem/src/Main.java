import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a finite number: ");
        String digit = scanner.next();

        if(digit.endsWith("0") || digit.endsWith("5")){
            System.out.println("Fizz");
        }
        else System.out.println("Buzz");

    }
}