import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the number to make the Table : ");
        int numT = input.nextInt();

        System.err.println("you are input " +numT);

        for (int i = 1;i <= numT;i++){
            for(int j = 1; j <= numT;j++){
                System.out.print((i*j) + "  ");
            }
            System.out.println();
        }
    }
    
}
