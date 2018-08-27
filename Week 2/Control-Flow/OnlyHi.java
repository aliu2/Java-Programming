/* reads in a word and examines every pair of letters but only prints them if they are "hi" */
import java.util.Scanner;

public class OnlyHi
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = in.next();

		for (int i = 0; i < word.length()-1; i++)
		{
			if (word.substring(i,i+2).equals("hi"))
			{
				System.out.println("hi");
			}
		}
	}
}
