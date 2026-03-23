import java.io.*;

public class Main {
    public static void saveInventory(String fileName, String data) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(data);
            writer.close();
            System.out.println("Inventory saved successfully.");
        } catch (IOException e) {
            System.out.println("Error while saving inventory.");
        }
    }

    public static String loadInventory(String fileName) {
        StringBuilder data = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                data.append(line).append("\n");
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error while loading inventory.");
        }

        return data.toString();
    }

    public static void main(String[] args) {
        System.out.println("=== UC12: Data Persistence & System Recovery ===");

        String fileName = "inventory.txt";
        String inventoryData = "Suite: 2\nDeluxe: 1\nBasic: 3";

        saveInventory(fileName, inventoryData);

        System.out.println("\nRecovered Inventory Data:");
        String recoveredData = loadInventory(fileName);
        System.out.println(recoveredData);
    }
}