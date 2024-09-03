import java.util.Scanner;

public class DiamondShapewithAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the number of rows for the top half of the Dimod : ");
        int numt = input.nextInt();

        for(int i = 1; i <= numt; i++){
            for(int j = numt; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1;k <= (2 * i - 1) ;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = numt - 1; i >= 1 ; i--){
            for(int j = numt; j > i; j--){
                System.err.print(" ");
            }
            for(int k = 1;k <= (2 * i - 1) ;k++){
                System.err.print("*");
            }
            System.err.println();
    
    }
}
}
