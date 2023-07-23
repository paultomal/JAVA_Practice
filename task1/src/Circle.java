public class Circle extends Shape{
    public final double PI = 3.1416;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI*radius*radius;
    }
}
