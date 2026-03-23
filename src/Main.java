import java.util.ArrayList;
import java.util.List;

class Reservation {
    String guestName;
    String roomType;
    List<String> services;

    Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.services = new ArrayList<>();
    }

    void addService(String service) {
        services.add(service);
    }

    void showReservationDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Selected Services: " + services);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Add-On Service Selection ===");

        Reservation reservation = new Reservation("Aarav", "Deluxe");

        reservation.addService("Breakfast");
        reservation.addService("Airport Pickup");
        reservation.addService("Extra Bed");

        reservation.showReservationDetails();
    }
}