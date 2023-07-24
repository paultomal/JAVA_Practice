public class Person {
    private String name;
    private String age;

    public Person(String n , String a ){
        name = n;
        age = a;
        setName(n);
        setAge(a);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }
    public void personInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}
