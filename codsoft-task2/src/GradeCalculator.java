import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int numSubjects = 0;
        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();

        for (int i = 1; i <= numSubjects; i++) {

            System.out.print("Enter the marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage + "%");

        if (averagePercentage >= 90) {
            System.out.println("Grade: A");
        }
        else if (averagePercentage >= 80) {
            System.out.println("Grade: B");
        }
        else if (averagePercentage >= 70) {
            System.out.println("Grade: C");
        } 
        else if (averagePercentage >= 60) {
            System.out.println("Grade: D");
        } 
        else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}