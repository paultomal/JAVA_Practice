public class Computer {
    private Monitor monitor;
    private String processor;
    private int RAM;
    public Computer(){

    }

    public Computer(String processor, int RAM){
        setProcessor(processor);
        setRAM(RAM);
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getRAM() {
        return RAM;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "monitor=" + monitor +
                ", processor='" + processor + '\'' +
                ", RAM=" + RAM +
                '}';
    }
}
