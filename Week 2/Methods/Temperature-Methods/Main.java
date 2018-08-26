import java.util.Scanner;

public class Main
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a temperature in celsius: ");
		System.out.println("Fahrenheit: " + Temp.fahr2cels(in.nextDouble()));
	}
}
