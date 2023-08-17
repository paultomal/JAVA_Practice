public class MainFile {

        public static void main(String[] args) {
            Shape[] shapes = new Shape[4];
            shapes[0] = new Rectangle(5,6);
            shapes[1] = new Circle(4);
            shapes[2] = new Rectangle(2.5, 4);
            shapes[3] = new Circle(5);

            for (Shape shape : shapes) {
                double area = shape.calculateArea();
                System.out.println("Area: " + area);
            }
        }
    
}
