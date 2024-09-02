
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random input1 = new Random();
        int numberToGuess = input1.nextInt(100) + 1;
        int myguss = 0;
        Scanner scanner = new Scanner(System.in);

        do { 
            System.out.println("Enter Number you gussing : ");
            myguss = scanner.nextInt();

            if (myguss > numberToGuess) {
                System.out.println("Too high! Try again.");    
            } else if (myguss < numberToGuess){
                System.out.println("Too low! try again.");
            }else {
                System.out.println("Congrgulation! You win the Game ");
            }
        } while (myguss != numberToGuess);
        scanner.close();
    }
    
}
