public class Laptop extends Computer{

    private int batteryCapacity;
    private int weight;
    public Laptop(int batteryCapacity, int weight) {

        setWeight(weight);
        setBatteryCapacity(batteryCapacity);
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", \nweight=" + weight +
                '}'+ super.toString();
    }
}
