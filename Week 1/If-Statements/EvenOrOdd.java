/* Reads in an integer and prints whether it is even or odd */
import java.util.Scanner;

public class EvenOrOdd
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		if (n % 2 == 0)
		{
			System.out.printf("%d is even.", n);
		}
		else
		{
			System.out.printf("%d is odd.", n);
		}
	}
}
