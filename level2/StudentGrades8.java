import java.util.Scanner;

public class StudentGrades8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        int[][] marks = new int[numStudents][3];
        String[] subjects = {"Physics", "Chemistry", "Maths"};
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " marks:");
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print(subjects[j] + ": ");
                    marks[i][j] = input.nextInt();
                } while (marks[i][j] < 0);
            }
        }
        input.close();
        
        System.out.println("\nStudent Report:");
        System.out.println("Physics Chemistry Maths Percentage Grade");
        
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
            
            System.out.println(marks[i][0] + " " + marks[i][1] + " " + marks[i][2] + " " + percentage + "% " + grade);
        }
    }
}