import java.util.Scanner;
class NumberType2
{
	public static void main(String[]args)
 	{
		Scanner input=new Scanner(System.in);
		int arr[]=new int[5];
		for (int i=0;i<5;i++)
		{
			System.out.print("enter no");
			arr[i]=input.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			if (arr[i]>0)
			{
				System.out.print("the "+arr[i]+" is positive\n");
				if (arr[i]%2==0)
				{
					System.out.print("no"+arr[i]+" is even\n");
				}
				else
				{
					System.out.print("no"+arr[i]+"is odd\n");
				}
			}
                        else if(arr[i]==0)
			{
				System.out.print("the no"+arr[i]+" is zero\n");
     			}
			else
			{
				System.out.print("the no"+arr[i]+" is negative\n");
			}
		
		}
		input.close();
 	}
}