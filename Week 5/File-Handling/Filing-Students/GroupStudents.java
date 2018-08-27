import java.util.Scanner;
import java.io.*;

public class GroupStudents
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(new File(args[0]));

			int numStudents = sc.nextInt();
			Student[] students = new Student[numStudents];

			for (int i = 0; i < numStudents; i++)
			{
				students[i] = new Student(sc.next(), sc.nextInt());
			}

			Student.print(students);
		}

		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
		}
	}
}
