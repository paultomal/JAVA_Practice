public class Duck implements Flyable,Swimmable{
    @Override
    public void fly() {
        System.out.println("Duck can Fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck also can Swim");
    }
}
