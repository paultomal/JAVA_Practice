public class Cat extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("Cat Eats Nom Nom");
    }

    @Override
    public void swim() {
        System.out.println("Cat can't swim");
    }
}
