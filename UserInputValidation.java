import java.util.Scanner;

public class UserInputValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do { 
            System.out.println("Enter a Positive Number");
            num = input.nextInt();
            if(num <= 0){
                System.out.println("Invaild Number Plz Enter a Postive Number ");
            }
        } while (num <= 0);
        System.out.println("Correct Thank you to give a Postive number ");
    }
    
}
