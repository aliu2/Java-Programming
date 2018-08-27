//USING sc FOR FILE SCANNERS
import java.util.Scanner;
import java.io.*;

public class CommandLineName
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(new File(args[0]));

			int len = sc.nextInt();
			String[] names = new String[len];

			for (int i = 0; i < len; i++)
			{
				names[i] = sc.next();
			}

			System.out.println("The names in reverse order are:");
			for (int i = len-1; i >= 0; i--)
			{
				System.out.printf("%s ", names[i]);
			}
		}

		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
		}
	}
}
