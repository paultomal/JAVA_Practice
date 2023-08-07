import java.text.NumberFormat;
import java.util.Scanner;

public class AdvanceMortgageCalculator {
    public static void main(String[] args) {

        final int monthsOfYears = 12;
        final int percent = 100;

        Scanner scanner = new Scanner(System.in);
        int principal = 0;

        while (true) {
            System.out.print("Amount Of Loan ($1k to $1m) : ");
            principal = scanner.nextInt();
            if (principal>=1000 && principal<=1_000_000)
                break;
            System.out.println("Enter amount from 1k to 1m !!");
        }


        double annualInterestRate;
        double monthlyInterestRate;

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate =scanner.nextDouble();
            if (annualInterestRate >0 && annualInterestRate <= 30){
                 monthlyInterestRate =annualInterestRate / percent / monthsOfYears;
                break;}
            System.out.println("Enter value more than 0 to less or equal then 30");        //NumberFormat.getPercentInstance().format(annualInterestRate);

        }


        int years;
        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextInt();
            if (years >=0 && years <= 30)
                break;
            System.out.println("Enter year more than 0 to less or equal then 30");
        }
        double numberOfPayment = years*monthsOfYears;

        double cal1 = monthlyInterestRate * Math.pow(1+monthlyInterestRate,numberOfPayment);
        double cal2 = Math.pow(1+monthlyInterestRate,numberOfPayment)-1;

        Double mortgage;
        mortgage = principal * (cal1/cal2);
        System.out.println("Mortgage : "+ NumberFormat.getCurrencyInstance().format(mortgage));

    }
}