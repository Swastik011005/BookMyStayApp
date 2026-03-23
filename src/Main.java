import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Error Handling & Validation ===");

        try {
            System.out.print("Enter guest name: ");
            String guestName = sc.nextLine();

            if (guestName.trim().isEmpty()) {
                throw new IllegalArgumentException("Guest name cannot be empty.");
            }

            System.out.print("Enter number of nights: ");
            int numberOfNights = sc.nextInt();

            if (numberOfNights <= 0) {
                throw new IllegalArgumentException("Number of nights must be greater than 0.");
            }

            System.out.println("\nBooking details are valid.");
            System.out.println("Guest Name       : " + guestName);
            System.out.println("Number of Nights : " + numberOfNights);

        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input Error: Please enter valid data.");
        } finally {
            sc.close();
        }
    }
}