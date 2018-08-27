/* keep reading numbers until it comes to a -1 and print the number just before the -1 */
import java.util.Scanner;

public class PenultimateNumber
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int holder = num;

		while (num != -1)
		{
			holder = num;
			num = in.nextInt();
		}

		System.out.println(holder);
	}
}
