import java.text.NumberFormat;

public class MortgageReport {

    private Calculation calculation;

    public MortgageReport(Calculation calculation) {
        this.calculation = calculation;
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= calculation.getYears() * Calculation.MONTHS_IN_YEAR; month++) {
            double balance = calculation.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public void printMortgage() {
        double mortgage = calculation.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
