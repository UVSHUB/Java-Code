import java.util.Scanner;
public class priceofrice
{
    public static void main(String[] args)
    {
        double price,killo,total;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Price of 1KG Rice ");
        price = input.nextDouble();
        System.out.println("Enter the killo want ");
        killo = input.nextDouble();
        total = price*killo;
    System.out.println("Price of the Rice"  + total);
    }
}