public class Main {
    public static void main(String[] args) {
    Animal myAnimal = new Animal();
    myAnimal.eat();

    Dog myDog = new Dog();
    myDog.eat();
    myDog.eat(3);
    myDog.swim();


    Cat myCat = new Cat();
    myCat.eat();
    myCat.swim();
    }
}