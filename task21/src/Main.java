public class Main {
    public static void main(String[] args) {
        Laptop l = new Laptop(100, 1);
        l.setMonitor(new Monitor("FHD (1920x1080)", 144,"ASRock"));
        l.setProcessor("Intel 13th Gen Core i5 13600K Raptor Lake Processor");
        l.setRAM(4);
        System.out.println(l);
    }
}