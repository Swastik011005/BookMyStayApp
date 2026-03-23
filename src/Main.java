import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Book My Stay App ===");
        System.out.println("Use Case 4: Room Search & Availability Check");
        System.out.println();

        // Centralized room inventory
        HashMap<String, Integer> roomInventory = new HashMap<>();
        roomInventory.put("Single Room", 5);
        roomInventory.put("Double Room", 3);
        roomInventory.put("Suite Room", 2);

        System.out.println("Available Room Inventory:");
        for (Map.Entry<String, Integer> entry : roomInventory.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " rooms available");
        }

        System.out.println();

        // Search room type
        String searchRoom = "Suite Room";
        System.out.println("Searching for room type: " + searchRoom);

        if (roomInventory.containsKey(searchRoom)) {
            int available = roomInventory.get(searchRoom);
            System.out.println("Room found.");
            System.out.println("Available count: " + available);

            if (available > 0) {
                System.out.println("Status: Available for booking");
            } else {
                System.out.println("Status: Not available");
            }
        } else {
            System.out.println("Room type not found in inventory");
        }
    }
}