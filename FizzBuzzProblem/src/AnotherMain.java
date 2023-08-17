import java.util.Scanner;

public class AnotherMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a finite number: ");
        int digit = scanner.nextInt();

        // This is not nested but it doesn't fulfill DRY(don't repeat yourself)

        if(digit % 5 == 0 && digit % 3==0){
            System.out.println("FizzBuzz");
        } else if (digit % 3 == 0) {
            System.out.println("Buzz");
        } else if (digit % 5 == 0) {
            System.out.println("Fizz");
        }
        else System.out.println(digit);



        /*

        // Bad Practice to implement nested if
        if(digit % 5 == 0){
            if (digit % 3==0) {
                System.out.println("FizzBuzz");
            }
            else System.out.println("Fizz");
        } else if (digit % 3 == 0) {
            System.out.println("Buzz");
        }
        else System.out.println(digit);

        * */


    }
}
