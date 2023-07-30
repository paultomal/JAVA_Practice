public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area of circle: "+ c.calculateArea());
        System.out.println("perimeter circle: "+c.calculatePerimeter());


        Square s = new Square();
        System.out.println("Area of Square: "+ s.calculateArea());
        System.out.println("perimeter Square: "+s.calculatePerimeter());
    }
}