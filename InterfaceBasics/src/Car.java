public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car Is Starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is Stopped");
    }
}
