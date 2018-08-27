/* reads in numbers until -1 is encountered, prints how many numbers were entered */
import java.util.Scanner;

public class HowManyNumbers
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;

		while (num != -1)
		{
			count++;
			num = in.nextInt();
		}
		System.out.printf("%d numbers were entered.\n", count);
	}
}
