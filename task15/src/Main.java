public class Main { public static void main(String args[]) {
    Greeting e = new Greeting() {
        public void sayHello(){
            System.out.println("Hello");
        }

    };
    e.sayHello();


}
}