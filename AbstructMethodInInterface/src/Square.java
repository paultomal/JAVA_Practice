public class Square implements Shape{
    double a=5.5;
    @Override
    public double calculateArea() {


        double area = a*a;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 4*a;
        return perimeter;

    }
}
