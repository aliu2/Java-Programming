/* Reads in an index and a string and outputs the string without the character at that index */
import java.util.Scanner;

public class ReducedString
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an index: ");
		int n = in.nextInt();
		System.out.println("Enter a string: ");
		String word = in.next();

		System.out.println(word.substring(0,n) + word.substring(n+1, word.length()));
	}
}
