public class Main {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        try {
            int r1 = myCal.divide(6,0);
            System.out.println(r1);
        }catch ( DivideByZeroException ae){
             System.out.println("Can't be divided by 0");
        }
    }
}