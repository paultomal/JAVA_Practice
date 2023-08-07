import java.text.NumberFormat;
import java.util.Scanner;

public class MoreAdvanceMortgageCalculator {
    public static void main(String[] args) {

       int principal = (int)readNumber("(Beautifully New) Amount Of Loan ($1k to $1m) :" , 1000,1_000_000);
       double annualInterestRate =  readNumber("Annual Interest Rate: ", 0,30);
       byte years = (byte) readNumber("Period (Years): ",0,30);

        double mortgage = calculateMortgage(principal, annualInterestRate, years);
        System.out.println("Mortgage : "+ NumberFormat.getCurrencyInstance().format(mortgage));
    }
    public static double readNumber(String prompt , double min, double max ){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value>=min && value<=max)
                break;
            System.out.println("Enter amount from " + min + " " + max + "!!");
        }
        return value;

    }


    public static double calculateMortgage(int principal,
                                           double annualInterestRate,
                                           int years){
        final int monthsOfYears = 12;
        final int percent = 100;

        double numberOfPayment = years*monthsOfYears;
        double monthlyInterestRate =annualInterestRate / percent / monthsOfYears;

        double cal1 = monthlyInterestRate * Math.pow(1+monthlyInterestRate,numberOfPayment);
        double cal2 = Math.pow(1+monthlyInterestRate,numberOfPayment)-1;
        double mortgage = principal * (cal1/cal2);
        return mortgage;
    }
}