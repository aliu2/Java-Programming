/* Reads in an integer and ouputs twice it's value using a method from another class */
import java.util.Scanner;

public class Main
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(TimesTwoMethod.twoTimes(n));
	}
}
