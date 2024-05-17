import java.util.ArrayList;
import java.util.List;

public class TaxiBookingSystem {
    private List<Taxi> taxis = new ArrayList<Taxi>();
    private List<Booking> bookings = new ArrayList<>();
    private int bookingsCount = 0;

    public void addTaxi(String taxiId, String driverName) {
        taxis.add(new Taxi(taxiId, driverName));
    }

    public void displayAvailableTaxis() {
        System.out.println("Available Taxis");
        for (Taxi taxi : taxis) {
            if (taxi.isAvailable()) {
                System.out.println("Taxi ID: " + taxi.getTaxiId() + "Driver Name : " + taxi.getDriverName());
            }
        }
    }

    public void bookTaxi(String passengerName) {
        for (Taxi taxi : taxis) {
            if (taxi.isAvailable()) {
                String bookingId = "B" + bookingsCount++;
                Booking booking = new Booking(bookingId, passengerName, taxi.getTaxiId());
                bookings.add(booking);
                taxi.setAvailable(false);
                System.out.println("Booking Successful !🤞");
                System.out.println("Booking ID: " + booking.getBookingId() + "Passenger Name: "
                        + booking.getPassengerName() + "Taxi ID: " + booking.getTaxiId());
                return;
            }
        }
    }

    public void displayBookings() {
        System.out.println("Booking Details 🤷‍♂️");
        for (Booking booking : bookings) {
            System.out
                    .println("Booking Id : " + booking.getBookingId() + "Passenger Name : " + booking.getPassengerName()+" Taxi Id : " + booking.getTaxiId());
        }
    }

}
