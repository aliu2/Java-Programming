/* reads in a number and then reads in that many numbers and gets the average of those numbers */

import java.util.Scanner;

public class OnlyAverage
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers: ");
		int num = in.nextInt();

		float sum = 0;
		for (int i = 0; i < num; i++)
		{
			float m = in.nextFloat();
			sum += m;
		}
		System.out.println("The average is " + sum/num);
	}
}
