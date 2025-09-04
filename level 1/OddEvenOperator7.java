import java.util.Scanner;

public class OddEvenOperator7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        if (number < 1) {
            System.out.println("Error: Please enter a natural number (greater than 0). Exiting program.");
            return;
        }
        
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        int evenIndex = 0, oddIndex = 0;
        
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }
        
        System.out.println("\nEven numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        
        System.out.println("\n\nOdd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        
        scanner.close();
    }
}
