import java.util.Scanner;

public class AbsolutelyPositive
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		if (n < 0)
		{
			System.out.printf("The absolute value is %d.", -n);
		}
		else
		{
			System.out.printf("The absolute value is %d.", n);
		}
	}
}
