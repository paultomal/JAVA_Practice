public class AllInOnePrinter implements Printable, Scanable{
    @Override
    public void print() {
        System.out.println("All In One Printing");
    }

    @Override
    public void scan() {
        System.out.println("All In One Scanning");
    }
}
