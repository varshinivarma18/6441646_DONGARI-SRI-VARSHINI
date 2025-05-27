import java.util.Scanner;

public class q9_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for marks
        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        // Check for valid input
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
        } else {
            // Use if-else statements to determine grade
            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 80) {
                System.out.println("Grade: B");
            } else if (marks >= 70) {
                System.out.println("Grade: C");
            } else if (marks >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }

        scanner.close();
    }
}
