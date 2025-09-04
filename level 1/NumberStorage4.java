import java.util.Scanner;

public class NumberStorage4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers (enter 0 or a negative number to stop):");
        
        while (true) {
            System.out.print("Enter a number: ");
            double input = scanner.nextDouble();
            
            if (input <= 0 || index == 10) {
                break;
            }
            
            numbers[index] = input;
            index++;
        }
        
        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        
        System.out.println("\nTotal sum: " + total);
        scanner.close();
    }
}
