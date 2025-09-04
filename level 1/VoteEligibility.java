import java.util.Scanner;
class VoteEligibility {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[];
                for (int i=0;i<10;i++)
		{
			arr[i]=input.nextInt();
		}
		for (int i=0;i<10;i++)
		{
			if arr[i]>=18
			{
				System.out.print("Age"+arr[i]"is eligible to vote");
			}
			else
			{
				System.out.println("Age"+arr[i]"is not eligible to vote");
			}
		}
	input.close();
}
}

