import java.util.Scanner;

public class StudentGrades9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        int[][] marks = new int[numStudents][3];
        String[] subjects = {"Physics", "Chemistry", "Maths"};
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print(subjects[j] + " (0-100): ");
                    marks[i][j] = input.nextInt();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid input! Please enter a value between 0 and 100.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }
        }
        input.close();
        
        System.out.println("\nStudent Report:");
        System.out.printf("%-10s %-10s %-10s %-12s %-6s\n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        
        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = total / 3.0;
            String grade;
            
            if (percentage >= 90) {
                grade = "A";
            } else if (percentage >= 80) {
                grade = "B";
            } else if (percentage >= 70) {
                grade = "C";
            } else if (percentage >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            
            System.out.printf("%-10d %-10d %-10d %-12.2f %-6s\n", marks[i][0], marks[i][1], marks[i][2], percentage, grade);
        }
    }
}