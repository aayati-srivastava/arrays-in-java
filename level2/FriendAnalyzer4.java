import java.util.Scanner;

public class FriendAnalyzer4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter the height (in cm) of " + friends[i] + ": ");
            heights[i] = input.nextInt();
        }
        input.close();

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("The youngest friend is: " + friends[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[tallestIndex]);
    }
}
