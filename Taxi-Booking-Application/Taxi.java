public class Taxi {
    private String taxiId;
    private String driverName;
    private boolean isAvailable;

    // taxiId = 1
    // driverName = "santhosh"
    // isAvailable = true

    // {
    //     // taxiId = 1
    //     // driverName = "santhosh"
    //     // isAvailable = true
    // }

    public Taxi(String taxiId, String driverName) {
        this.taxiId = taxiId;
        this.driverName = driverName;
        this.isAvailable = true;
    }

    public String getTaxiId() {
        return taxiId;
    }

    public String getDriverName() {
        return driverName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}