public class Calculator {
    public int divide(int dividend, int divisor){
        if (divisor == 0){
            throw new ArithmeticException("Cannot Divided By Zero");
        }
        return dividend/divisor;
    }
}
