import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int monthsOfYears = 12;
        final int percent = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount Of Loan: ");
        int principal = scanner.nextInt();

        System.out.print( "Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();
        //NumberFormat.getPercentInstance().format(annualInterestRate);
        double monthlyInterestRate = annualInterestRate/percent/monthsOfYears;

        System.out.print( "Period (Years): ");
        int years  = scanner.nextInt();
        double numberOfPayment = years*monthsOfYears;

        double cal1 = monthlyInterestRate * Math.pow(1+monthlyInterestRate,numberOfPayment);
        double cal2 = (Math.pow(1+monthlyInterestRate,numberOfPayment))-1;

        Double mortgage;
        mortgage = principal * (cal1/cal2);
        System.out.println("Mortgage : "+ NumberFormat.getCurrencyInstance().format(mortgage));







    }
}