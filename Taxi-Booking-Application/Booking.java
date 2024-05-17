public class Booking {
    private String bookingId;
    private String passengerName;
    private String taxiId;

    // {
    //     bookingId = "B1";
    //     passengerName = "Demo1";
    //     taxiId = "1";
    // }

    public Booking(String bookingId, String passengerName, String taxiId){
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.taxiId = taxiId;
    }

    public String getBookingId() {
        return bookingId;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public String getTaxiId() {
        return taxiId;
    }

}
