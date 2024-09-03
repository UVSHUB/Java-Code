import java.util.Scanner;

public class PyramidNumberPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to make the Pyramid : ");
        int rows = input.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = rows; j > i; j--){
                System.err.print(" ");
            }
            for(int k = 1;k <= i ;k++){
                System.err.print(k + " ");
            }
            System.err.println();
        }
    }
    
}
