public class Child extends Parent{

    public static void displayInfo() {
        //super.displayInfo();
        System.out.println("Static method in Child class.");
    }

    @Override
    public void showInfo() {
        System.out.println("Instance method in Child");
    }
}
