import java.util.Scanner;

public class CurrencyBreakdownwithloops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the amount
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();

        // Array of denominations
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        // Array to hold the count of each denomination
        int[] noteCounter = new int[denominations.length];

        // Calculate the number of each denomination
        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                noteCounter[i] = amount / denominations[i];
                amount = amount % denominations[i];
            }
        }

        // Print the number of each denomination
        System.out.println("Currency breakdown:");
        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + " Notes/Coins: " + noteCounter[i]);
        }

        scanner.close();
    }
}

