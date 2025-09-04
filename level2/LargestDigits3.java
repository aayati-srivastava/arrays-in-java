import java.util.Scanner;

public class LargestDigits3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        input.close();

        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        
        for (int index = 0; number != 0 && index < maxDigits; index++) {
            digits[index] = number % 10; // Extract the last digit
            number /= 10; // Remove the last digit
        }

        if (digits[0] == 0) {
            System.out.println("Oops! No digits found.");
            return;
        }

        int largest = 0, secondLargest = 0;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
	input.close();
    }
}
