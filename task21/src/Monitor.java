public class Monitor {
    private String resolution;
    private int refreshRate;
    private String manufacturer;
    public Monitor(String resolution,int refreshRate,String manufacturer){
        setResolution(resolution);
        setRefreshRate(refreshRate);
        setManufacturer(manufacturer);
    };

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution='" + resolution + '\'' +
                ", refreshRate=" + refreshRate +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
