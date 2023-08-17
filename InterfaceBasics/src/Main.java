public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        Truck truck = new Truck();
        truck.honk();
        truck.start();
        truck.stop();
        Vehicle.inspect();

    }
}