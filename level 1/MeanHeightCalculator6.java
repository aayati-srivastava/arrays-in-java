import java.util.Scanner;

public class MeanHeightCalculator6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] heights = new double[11];
        double sum = 0.0;
        
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        
        double meanHeight = sum / 11;
        
        System.out.println("\nThe mean height of the football team is: " + meanHeight);
        
        scanner.close();
    }
}
