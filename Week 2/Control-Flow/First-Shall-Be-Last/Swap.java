/* swaps first and last letters of a string */
public class Swap
{
	public static String firstShallBeLast(String word)
	{
		String newWord = word.substring(word.length()-1, word.length()) + word.substring(1, word.length()-1) + word.substring(0,1);
		return newWord;
	}
}
