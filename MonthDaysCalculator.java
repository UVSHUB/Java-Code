import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mouth you what : ");
        String mouth = input.nextLine().trim();

        switch(mouth){
            case "january":{
                System.out.print(" They are 31 days");
            }
            break;
            case "march":{
                System.out.print(" They are 31 days");
            }
            break;
            case "may":{
                System.out.print(" They are 31 days");
            }
            break;
            case "july":{
                System.out.print(" They are 31 days");
            }
            break;
            case "august":{
                System.out.print(" They are 31 days");
            }
            break;
            case "october":{
                System.out.print(" They are 31 days");
            }
            break;
            case "december":{
                System.out.print(" They are 31 days");
            }
            break;
            case "april":{
                System.out.print(" They are 30 days");
            }
            case "june":{
                System.out.print(" They are 30 days");
            }
            case "september":{
                System.out.print(" They are 30 days");
            }
            case "november":{
                System.out.print(" They are 30 days");
            }
            case"february":
            System.out.print("this year is Leap year (true/false) : ");
            boolean yesOrNo = input.nextBoolean();
            if(true){
                System.out.print("They are 29 days");
            }else{
                System.out.print(" They are 28 days");

                }
            break;
            default:{
                System.out.print("Invalid mouth");
            }
                break;
        }
        input.close();

        }
        
    
}
