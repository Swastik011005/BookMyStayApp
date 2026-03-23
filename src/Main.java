import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Booking Cancellation & Inventory Rollback ===");

        HashMap<String, Integer> roomInventory = new HashMap<>();
        roomInventory.put("Standard", 5);
        roomInventory.put("Deluxe", 3);
        roomInventory.put("Suite", 2);

        String bookedRoomType = "Deluxe";

        System.out.println("\nInventory before booking cancellation:");
        System.out.println(roomInventory);

        roomInventory.put(bookedRoomType, roomInventory.get(bookedRoomType) + 1);

        System.out.println("\nBooking for room type '" + bookedRoomType + "' has been cancelled.");
        System.out.println("Inventory rolled back successfully.");

        System.out.println("\nInventory after cancellation:");
        System.out.println(roomInventory);
    }
}