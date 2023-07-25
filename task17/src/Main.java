public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        try {
            Person clonedPerson = (Person) person1.clone();
            System.out.println(clonedPerson);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}