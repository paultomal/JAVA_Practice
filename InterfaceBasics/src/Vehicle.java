public interface Vehicle {
    //static method create korle eita class e impliment korar drkr pore na
    //main class e direct call korte parbo.
    static void inspect(){
        System.out.println("Inspect");
    };
    default void honk(){
        System.out.println("Pi Pi Po Po");
    };
    void start();
    void stop();
}
