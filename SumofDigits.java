import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Positive Integer : ");

        int num = input.nextInt();
        int sumofDig = 0;

        while (num > 0) {
            int digit = num % 10;
            sumofDig = sumofDig + digit;
            num = num / 10;
            
        }
        System.out.println("the sum of the digits is : " + sumofDig);
        input.close();
    }
    
}
