import java.util.Scanner;

public class Main
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		if (Teen.isTeenager(in.nextInt()))
		{
			System.out.println("You are a teenager.");
		}
		else
		{
			System.out.println("You are not a teenager.");
		}
	}
}
