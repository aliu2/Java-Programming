/* reads in an integer num and prints the sum of all the numbers from 1 to num */
import java.util.Scanner;

public class SumNumbers
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++)
		{
			sum+=i;
		}
		System.out.printf("The sum of the numbers from 1 to %d is %d\n", num, sum);
	}
}
