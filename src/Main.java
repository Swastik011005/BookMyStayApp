import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Book My Stay App ===");
        System.out.println("Use Case 3: Centralized Room Inventory Management");
        System.out.println();

        // Centralized inventory using HashMap
        HashMap<String, Integer> roomInventory = new HashMap<>();

        // Add room types and available counts
        roomInventory.put("Single Room", 5);
        roomInventory.put("Double Room", 3);
        roomInventory.put("Suite Room", 2);

        System.out.println("Initial Room Inventory Details:");
        for (Map.Entry<String, Integer> entry : roomInventory.entrySet()) {
            System.out.println("Room Type: " + entry.getKey());
            System.out.println("Available Rooms: " + entry.getValue());
            System.out.println();
        }

        // Update inventory
        System.out.println("Updating inventory...");
        roomInventory.put("Double Room", 4);

        // Display updated inventory
        System.out.println();
        System.out.println("Updated Room Inventory Details:");
        for (Map.Entry<String, Integer> entry : roomInventory.entrySet()) {
            System.out.println("Room Type: " + entry.getKey());
            System.out.println("Available Rooms: " + entry.getValue());
            System.out.println();
        }

        // Search specific room type
        String searchRoom = "Suite Room";
        System.out.println("Checking availability for: " + searchRoom);
        if (roomInventory.containsKey(searchRoom)) {
            System.out.println("Available Rooms: " + roomInventory.get(searchRoom));
        } else {
            System.out.println("Room type not found.");
        }
    }
}