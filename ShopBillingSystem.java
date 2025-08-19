import java.util.Scanner;

public class ShopBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store item names and prices
        String[] items = {"Apples", "Bananas", "Milk", "Bread"};
        double[] prices = {2.5, 1.2, 3.0, 2.0};
        int[] quantities = new int[items.length];

        System.out.println("Welcome to FreshMart!");
        System.out.println("======================");

        // Loop to take quantity input for each item
        for (int i = 0; i < items.length; i++) {
            System.out.print("Enter quantity for " + items[i] + " (Price: $" + prices[i] + "): ");
            quantities[i] = sc.nextInt();
        }

        double total = 0;
        
        System.out.println("\n----- Bill Summary -----");
        for (int i = 0; i < items.length; i++) {
            double cost = prices[i] * quantities[i];
            if (quantities[i] > 0) { // Control statement example
                System.out.println(items[i] + " x " + quantities[i] + " = $" + cost);
            }
            total += cost;
        }

        // Discount logic (control statement)
        if (total > 20) {
            System.out.println(" You get a 10% discount!");
            total = total - (total * 0.10);
        }

        System.out.println("Total Bill: $" + total);
        System.out.println("======================");
        System.out.println("Thank you for shopping with us!");

        sc.close();
    }
}