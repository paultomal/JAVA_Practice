public class Parson {
    private String name;
    private int age;

    public Parson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Parson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
