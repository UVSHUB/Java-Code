import java.util.Scanner;

public class CharacterSquarePattern {
    public static void main( String[] args){
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the size of the square : ");
        int size  = input.nextInt();
        System.out.print("Enter the first Character : ");
        char ch = input.next().charAt(0);

        for(int i = 0; i < size; i++){
            char current = ch;
            for (int j = 0; j < size; j++){
                System.out.print( current + " ");
                current++;
            }
            ch++;
            System.out.println();
        }
    }
    
}
