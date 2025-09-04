import java.util.Scanner;
public class AgeHeight2{
	public static void main(String[]args)
	{
		Scanner input =new Scanner(System.in);
		int[] age = new int[3];
		double[] height = new double[3];
		String[] name= {"Amar","Akbar","Anthony"};
		
		for (int i=0; i<3;i++)
		{
			System.out.print(" enter age");
			age[i]= input.nextInt();
		}
		for(int i=0; i<3;i++)
		{
			System.out.print("enter height");
			height[i]= input.nextDouble();
		}
		int a=0;
		for (int i=1;i<3;i++)
		{
			if (age[i] < age[a])
			{
				a = i;
			}
        	}
                int h=0;
		for (int i=1;i<3;i++)
		{
			if (height[i] > height[a])
			{
				h = i;
			}
        	}
                System.out.println("the youngest is"+name[a]);
		System.out.println("the tallest is"+name[h]);
	}
}

		