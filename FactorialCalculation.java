import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Input the Number : ");
        int num = input.nextInt();
        int fac = 1;

        if(num < 0){
            System.out.println("Plz input Postive number ");
        }else{
            while(num > 0){
                fac = fac * num;
                num--;
            }

        }

       
        System.out.println("Factorial is of the number is : " + fac);
        input.close();
    }
    
}
