import java.util.Scanner;

public class CountingDownTimer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to Start to CountDown : ");
        int num = input.nextInt();

        while(num >= 0) {
            System.out.println(num);
            num--;
            
        }
        System.out.println("Countdown Complete!");
        input.close();

    }
    
}
