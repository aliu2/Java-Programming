import java.util.Scanner;

public class Main
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("The largest number is " + Largest.largestOfThree(in.nextInt(), in.nextInt(), in.nextInt()));
	}
}
