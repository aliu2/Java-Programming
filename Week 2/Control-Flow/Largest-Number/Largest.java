/* returns the largest of three integers */
public class Largest
{
	public static int largestOfThree(int a, int b, int c)
	{
		if (a > b)
		{
			if (a > c)
			{
				return a;
			}
			return c;
		}
		else if (b > c)
		{
			return b;
		}
		return c;
	}
}
