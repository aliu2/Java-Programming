import java.util.Scanner;

public class IsTeenager
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n < 20 && n > 12)
		{
			System.out.println("You are a teenager.");
		}
		else
		{
			System.out.println("You are not a teenager.");
		}
	}
}
