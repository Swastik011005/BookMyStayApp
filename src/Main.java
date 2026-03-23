import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Book My Stay App ===");
        System.out.println("Use Case 6: Reservation Confirmation & Room Allocation");
        System.out.println();

        // Room inventory
        HashMap<String, Integer> roomInventory = new HashMap<>();
        roomInventory.put("Single Room", 2);
        roomInventory.put("Double Room", 1);
        roomInventory.put("Suite Room", 1);

        // Booking request
        String customerName = "Aarav";
        String requestedRoom = "Single Room";

        System.out.println("Customer Name: " + customerName);
        System.out.println("Requested Room Type: " + requestedRoom);
        System.out.println();

        if (roomInventory.containsKey(requestedRoom) && roomInventory.get(requestedRoom) > 0) {
            int availableRooms = roomInventory.get(requestedRoom);

            System.out.println("Room is available.");
            System.out.println("Reservation confirmed for " + customerName);

            roomInventory.put(requestedRoom, availableRooms - 1);

            System.out.println("Room allocated: " + requestedRoom);
            System.out.println("Remaining " + requestedRoom + ": " + roomInventory.get(requestedRoom));
        } else {
            System.out.println("Reservation failed. Requested room is not available.");
        }

        System.out.println();
        System.out.println("Updated Room Inventory:");
        for (Map.Entry<String, Integer> entry : roomInventory.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}