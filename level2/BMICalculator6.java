import java.util.Scanner;

public class BMICalculator6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();
        
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmiValues = new double[numPersons];
        String[] weightStatus = new String[numPersons];
        
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = input.nextDouble();
            
            bmiValues[i] = weights[i] / (heights[i] * heights[i]);
            
            if (bmiValues[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmiValues[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmiValues[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        input.close();
        
        System.out.println("\nBMI Report:");
        System.out.println("Height(m) Weight(kg) BMI Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.println(heights[i] + " " + weights[i] + " " + bmiValues[i] + " " + weightStatus[i]);
        }
    }
}
