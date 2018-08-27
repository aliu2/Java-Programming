/* reads in a word and prints out every consecutive pair of letters starting from the first */
import java.util.Scanner;

public class SplitWord
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = in.next();

		for (int i = 0; i < word.length()-1; i++)
		{
			System.out.println(word.substring(i,i+2));
		}
	}
}
