public class Circle implements Shape{

    final double r = 3.1416;
    double radius = 5.5;
    @Override
    public double calculateArea() {
        double area = r*(radius*radius);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2*r*radius;
        return perimeter;
    }

}
