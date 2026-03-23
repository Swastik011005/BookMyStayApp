import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Book My Stay App ===");
        System.out.println("Use Case 5: Booking Request (First-Come-First-Served)");
        System.out.println();

        // FCFS booking queue
        Queue<String> bookingQueue = new LinkedList<>();

        // Add booking requests
        bookingQueue.offer("Aarav - Single Room");
        bookingQueue.offer("Diya - Double Room");
        bookingQueue.offer("Rohan - Suite Room");

        System.out.println("Booking requests received:");
        for (String request : bookingQueue) {
            System.out.println(request);
        }

        System.out.println();
        System.out.println("Processing booking requests in FCFS order:");
        while (!bookingQueue.isEmpty()) {
            String currentRequest = bookingQueue.poll();
            System.out.println("Processing: " + currentRequest);
        }

        System.out.println();
        System.out.println("All booking requests processed.");
    }
}