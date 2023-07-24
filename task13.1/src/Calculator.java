public class Calculator {
    public int divide(int dividend, int divisor) throws DivideByZeroException {
        if (divisor == 0) {
            throw new DivideByZeroException();
        }

        return dividend / divisor;
    }

}

