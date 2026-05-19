import java.util.Scanner;

public class GradeCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter score: ");
        int score = input.nextInt();

        String grade;

        if (score >= 70) {
            grade = "A";
        } else if (score >= 60) {
            grade = "B";
        } else if (score >= 50) {
            grade = "C";
        } else if (score >= 45) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nStudent: " + name);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
    }
}