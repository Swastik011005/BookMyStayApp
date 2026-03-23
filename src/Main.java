import java.util.ArrayList;

class Booking {
    String guestName;
    String roomType;
    int numberOfNights;

    Booking(String guestName, String roomType, int numberOfNights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
    }

    void displayBooking() {
        System.out.println("Guest Name      : " + guestName);
        System.out.println("Room Type       : " + roomType);
        System.out.println("Number of Nights: " + numberOfNights);
        System.out.println("-----------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Booking History & Reporting ===");

        ArrayList<Booking> bookingHistory = new ArrayList<>();

        bookingHistory.add(new Booking("Aarav", "Deluxe", 2));
        bookingHistory.add(new Booking("Diya", "Suite", 3));
        bookingHistory.add(new Booking("Rohan", "Standard", 1));

        System.out.println("\nBooking History:");
        for (Booking booking : bookingHistory) {
            booking.displayBooking();
        }

        System.out.println("Total Bookings: " + bookingHistory.size());
    }
}