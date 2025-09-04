import java.util.Scanner;

public class NumberReverser5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        
        // Find the count of digits
        int temp = number, count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        
        // Store digits in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        // Display the number in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}
