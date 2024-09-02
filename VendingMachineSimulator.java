import java.util.Scanner;

public class VendingMachineSimulator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to get the Product (1 to 4) : ");
        int vnum = input.nextInt();

        switch (vnum) {
            case 1:{
                System.out.print("Chips");
            }    
                break;
            case 2:{
                System.out.print("Chocolate");
            }    
                break;
            case 3:{
                System.out.print("Soda");
            }    
                break;
            case 4:{
                System.out.print("Water");
            }    
                break;
        
            default:{
                System.out.print("Invalid selection");
            }
                break;
        }
        input.close();
    }
    
}
