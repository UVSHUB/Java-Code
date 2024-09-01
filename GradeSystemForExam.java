import java.util.Scanner;

public class GradeSystemForExam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        for (int student = 1 ; student <= 3 ; student = student + 1){
            System.out.println("Student " + student + ":");

            int[] marks = new int[4];
            int total = 0;

            for (int i = 0; i < 4; i = i + 1) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = input.nextInt();
                total = total + marks[i];
            }
    
            double average = total / 4.0;
    
            String grade;
            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average <= 74) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }
    
            System.out.println("Average marks: " + average);
            System.out.println("Grade: " + grade);
        }
        }

        
        
}
