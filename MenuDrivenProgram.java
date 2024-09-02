import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n___Menu___ ");
            System.out.println("1 . Add two numbers");
            System.out.println("2 . Subtract two numbers ");
            System.out.println("3 . Multiply two numbers");
            System.out.println("4 . Divide two numbers");
            System.out.println("5 . Exit");
            System.out.print("Enter Number go to menu : ");

            choice = input.nextInt();

            switch (choice) {
                case 1:{
                    System.out.print("Enter the First Number : ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter the Second Number : ");
                    double num2 = input.nextDouble();
                    double sum = num1 + num2;
                    System.out.print("Sum of the two numbers are : " + sum);
                } 
                    break;
                case 2:{
                    System.out.print("Enter the First Number : ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter the Second Number : ");
                    double num2 = input.nextDouble();
                    double sub = num1 - num2;
                    System.out.print("Sum of the two numbers are : " + sub);
                } 
                    break;
                case 3:{
                    System.out.print("Enter the First Number : ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter the Second Number : ");
                    double num2 = input.nextDouble();
                    double sub = num1 - num2;
                    System.out.print("Sum of the two numbers are : " + sub);
                } 
                    break;
                case 4:{
                    System.out.print("Enter the First Number : ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter the Second Number : ");
                    double num2 = input.nextDouble();
                    double Mal = num1 * num2;
                    System.out.print("Sum of the two numbers are : " + Mal);
                } 
                    break;

                case 5:{
                    System.out.print("Enter the First Number : ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter the Second Number : ");
                    double num2 = input.nextDouble();
                    double Div = num1 / num2;
                    System.out.print("Sum of the two numbers are : " + Div);
                } 
                    break;
                case 6 : {
                    System.out.println("Thank You using me , Good Bye");
                }
                    break;
            
                default:{
                    System.out.println("Wrong Number input plz input in 1 to 6");
                }
                    break;
            }
        }while(choice != 5);

        input.close();
    }

    
}
