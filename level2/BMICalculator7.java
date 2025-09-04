import java.util.Scanner;

public class BMICalculator7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();
        
        double[][] personData = new double[numPersons][3]; // [height, weight, BMI]
        String[] weightStatus = new String[numPersons];
        
        for (int i = 0; i < numPersons; i++) {
            do {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (personData[i][0] <= 0);
            
            do {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (personData[i][1] <= 0);
            
            // Calculate BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            
            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        input.close();
        
        System.out.println("\nBMI Report:");
        System.out.println("Height(m) Weight(kg) BMI Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.println(personData[i][0] + " " + personData[i][1] + " " + personData[i][2] + " " + weightStatus[i]);
        }
    }
}
