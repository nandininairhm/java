import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Store {

    static String[] items = {"Rice", "Sugar", "Oil", "Soap", "Milk"};
    static int[] prices = {50, 40, 100, 25, 30};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] quantities = new int[items.length];

        System.out.println("Welcome to the Grocery Store!");
        System.out.println("Available items and their prices (per unit):");

        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - ₹" + prices[i]);
        }

        
        for (int i = 0; i < items.length; i++) {
            while (true) {
                try {
                    System.out.print("Enter quantity for " + items[i] + ": ");
                    quantities[i] = Integer.parseInt(scanner.nextLine());
                    if (quantities[i] < 0) {
                        System.out.println("Please enter a non-negative number.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
        }

        
        double totalAmount = calculateTotal(quantities);

    
        System.out.printf("Final amount to be paid: ₹%.2f%n", totalAmount);

        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Purchase Date & Time: " + now.format(formatter));

        scanner.close();
    }

    
    public static double calculateTotal(int[] quantities) {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            total += prices[i] * quantities[i];
        }

        if (total > 500) {
            System.out.println("Congratulations! You received a 10% discount.");
            total = total - (total * 0.10); 
        }

        return total;
    }
}
