import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to make the Pascal Triangle : ");
        int pas = input.nextInt();

        for(int i = 0; i < pas; i++){
            int num = 1;
            for(int k = 0; k < pas - i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i ; j++){
                System.out.print(num + "  ");
                num = num*(i - j)/(j + 1) ;
            }
            System.out.println();
        }
    }
    
}
