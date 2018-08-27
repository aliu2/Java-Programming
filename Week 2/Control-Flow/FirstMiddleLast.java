/* reads in a word and prints the first letter, then the middle letters
   and finally, the last letter of the word */
import java.util.Scanner;

public class FirstMiddleLast
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = in.next();

		System.out.println(word.substring(0, 1));
		System.out.println(word.substring(1, word.length()-1));
		System.out.println(word.substring(word.length()-1, word.length()));
	}
}
