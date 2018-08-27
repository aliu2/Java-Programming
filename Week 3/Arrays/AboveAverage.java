import java.util.Scanner;

public class AboveAverage
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers:");
		int num = in.nextInt();
		float [] floatArray = new float[num];
		float sum = 0;
		

		System.out.println("Enter " + num + " numbers:");
		for (int i = 0; i < num; i++)
		{
			floatArray[i] = in.nextFloat();
			sum += floatArray[i];
		}

		
		System.out.print("The numbers above average are:");
		for (float n: floatArray)
		{
			if (n > sum/num)
			{
				System.out.printf(" %.2f", n);
			}
		}
	}
}
