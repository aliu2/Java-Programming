import java.util.Scanner;

public class ForOneToNum
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int i = 1; i <= num; i++)
		{
			System.out.print(i + " ");
		}
	}
}
