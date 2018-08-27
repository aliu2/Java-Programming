//USING sc FOR FILE SCANNERS
import java.util.Scanner;
import java.io.*;

public class ReadNames
{
	public static void main(String[] args)
	{
		try
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the file name:");
			Scanner sc = new Scanner(new File(in.next()));

			int len = sc.nextInt();
			String[] strArr = new String[len];

			for (int i = 0; i < len; i++)
			{
				strArr[i] = sc.next();
			}

			System.out.println("The names in reverse order are:");
			for (int i = len-1; i >= 0; i--)
			{
				System.out.printf("%s ", strArr[i]);
			}
		}

		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
		}
	}
}
