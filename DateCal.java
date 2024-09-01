import java.util.Scanner;

public class DateCal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int date;
        System.out.print("Enter the Date number in 1 to 7 : ");
        date = input.nextInt();

        switch(date){
            case 1 -> System.out.print("Monday");
            case 2 -> System.out.print("Tuesday");
            case 3 -> System.out.print("Wendesday");
            case 4 -> System.out.print("Thesday");
            case 5 -> System.out.print("Friday");
            case 6 -> System.out.print("Saturday");
            case 7 -> System.out.print("Sunday");
            default -> System.out.print("Invaild Day");
        }
    }
}