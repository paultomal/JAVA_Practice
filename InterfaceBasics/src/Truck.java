public class Truck implements Vehicle{

    @Override
    public void start() {
        System.out.println("Track is Starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck Stopped");
    }
}
