import java.util.ArrayList;
import java.util.List;

class RoomInventory {
    private final List<String> availableRooms = new ArrayList<>();

    public RoomInventory() {
        availableRooms.add("Suite-1");
        availableRooms.add("Deluxe-1");
        availableRooms.add("Basic-1");
    }

    public synchronized String bookRoom(String guestName) {
        if (availableRooms.isEmpty()) {
            return guestName + " could not book a room. No rooms available.";
        }

        String room = availableRooms.remove(0);
        return guestName + " successfully booked " + room;
    }

    public synchronized void showAvailableRooms() {
        System.out.println("Remaining Rooms: " + availableRooms);
    }
}

class BookingTask extends Thread {
    private final RoomInventory inventory;
    private final String guestName;

    public BookingTask(RoomInventory inventory, String guestName) {
        this.inventory = inventory;
        this.guestName = guestName;
    }

    @Override
    public void run() {
        System.out.println(inventory.bookRoom(guestName));
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== UC11: Concurrent Booking Simulation ===");

        RoomInventory inventory = new RoomInventory();

        BookingTask guest1 = new BookingTask(inventory, "Aman");
        BookingTask guest2 = new BookingTask(inventory, "Bina");
        BookingTask guest3 = new BookingTask(inventory, "Charan");
        BookingTask guest4 = new BookingTask(inventory, "Divya");

        guest1.start();
        guest2.start();
        guest3.start();
        guest4.start();

        try {
            guest1.join();
            guest2.join();
            guest3.join();
            guest4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        inventory.showAvailableRooms();
    }
}