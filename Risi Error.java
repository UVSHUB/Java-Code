import java.util.Scanner;
public class IT24101071Lab4Q2{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
double exam_marks, lab_marks = 0, per_exam_marks, per_lab_marks, total1, total2, total;
System.out.print("Please enter exam marks (out of 100): ");
exam_marks = input.nextDouble();
if(exam_marks>=0 && exam_marks<=100)
{
System.out.print("Please enter lab submission marks (out of 100): ");
lab_marks = input.nextDouble();
}
else
{
System.out.print("Invalid input for exam marks. Terminating program.");
}
System.out.print("Please enter the percentage given for the exam: ");
per_exam_marks = input.nextDouble();
System.out.print("Please enter the percentage given for lab submission: ");
per_lab_marks = input.nextDouble();
if(per_lab_marks + per_exam_marks == 100)
{
total1 = exam_marks * per_exam_marks/100;
total2 = lab_marks * per_lab_marks/100;
total = total1 + total2;
System.out.print("Final Exam Mark is : " + total);
}
else
{
System.out.print("The percentages must add up to 100. Terminating program.");
}
}
}