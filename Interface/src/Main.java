public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2023(10_00);
        var report = new  TaxReport(calculator);
        report.show();

        report.setTaxCalculator(new TaxCalculator2022());
        report.show();
    }
}