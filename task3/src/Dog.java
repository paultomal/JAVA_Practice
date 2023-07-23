public class Dog extends Animal implements Swim{
    private int breed;

    @Override
    public void eat() {
        System.out.println("My Dog Says Chomp Chomp");
    }

    public void eat(int numberOfTime) {
        for(int i = 0; i<numberOfTime; i++){
            System.out.println("ChomChom");
        }

    }

    @Override
    public void swim() {
        System.out.println("Dog can swim");
    }

    public int getBreed(){
        return breed;
    }
    public void  setBreed(int breed){
        this.breed = breed;
    }
}
