import java.util.Scanner;

public class Initial
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = in.next();
		System.out.printf("%s starts with the letter %s.\n", name, name.substring(0,1));
	}
}
