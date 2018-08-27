/* reads in a number num and a string and produces a new string
   which is num copies of the original string */
import java.util.Scanner;

public class StringReproduction
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number and a string: ");
		int num = in.nextInt();
		String word = in.next();
		String newWord = "";

		for (int i = 0; i < num; i++)
		{
			newWord += word;
		}
		System.out.println(newWord);
	}
}
