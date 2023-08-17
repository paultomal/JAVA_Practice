public class TaxReport {
    private TaxCalculator taxCalculator;

    public TaxReport(TaxCalculator taxCalculator){
       this.taxCalculator = taxCalculator;
    }
    public void show(){
        var tax = taxCalculator.calculateTax();
        System.out.println(tax);
    }
    public void setTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

}
