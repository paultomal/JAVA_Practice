import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        System.out.println("Your age is : " + name);
    }
}