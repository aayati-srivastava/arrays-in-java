import java.util.Scanner;

public class MultiplicationTable3 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Multiplication Table Generator!");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();
        
        System.out.println("\nHere is the multiplication table for " + number + ":\n");
        
        int[] multiplicationTable = new int[10];
        
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + multiplicationTable[i - 1]);
        }
        
        System.out.println("\nThank you for using the Multiplication Table Generator! Have a great day!");
        
        scanner.close();
    }
}
