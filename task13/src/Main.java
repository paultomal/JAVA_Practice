// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Calculator myCal = new Calculator();
       try {
           int r1 = myCal.divide(6,2);
           System.out.println(r1);
       }catch (ArithmeticException ae){
           System.out.println("Can't be divided by 0");
       }
    }
}