// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Printer myPrinter = new Printer();
       Scanner myScanner = new Scanner();
       AllInOnePrinter myAllInOnePrinter = new AllInOnePrinter();

        myPrinter.print();
        myScanner.scan();
        myAllInOnePrinter.print();
        myAllInOnePrinter.scan();
    }
}