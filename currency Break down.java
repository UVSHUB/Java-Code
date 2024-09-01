import java.util.Scanner;

public class CurrencyBreakdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount in rupees: ");
        int amount = input.nextInt();

        int n5000 = amount / 5000;
        amount = amount % 5000;

        int n1000 = amount / 1000;
        amount %= 1000;

        int n500 = amount / 500;
        amount %= 500;

        int n200 = amount / 200;
        amount %= 200;

        int n100 = amount / 100;
        amount %= 100;

        int n50 = amount / 50;
        amount %= 50;

        int n20 = amount / 20;
        amount %= 20;

        int n10 = amount / 10;
        amount %= 10;

        int n5 = amount / 5;
        amount %= 5;

        int n2 = amount / 2;
        amount %= 2;

        int n1 = amount;

        System.out.println("Currency breakdown:");
        System.out.println("5000 Notes/Coins: " + n5000);
        System.out.println("1000 Notes/Coins: " + n1000);
        System.out.println("500 Notes/Coins: " + n500);
        System.out.println("200 Notes/Coins: " + n200);
        System.out.println("100 Notes/Coins: " + n100);
        System.out.println("50 Notes/Coins: " + n50);
        System.out.println("20 Notes/Coins: " + n20);
        System.out.println("10 Notes/Coins: " + n10);
        System.out.println("5 Notes/Coins: " + n5);
        System.out.println("2 Notes/Coins: " + n2);
        System.out.println("1 Notes/Coins: " + n1);

        input.close();
    }
}
