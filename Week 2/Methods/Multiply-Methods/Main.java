import java.util.Scanner;

public class Main
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		System.out.println(Product.multiply(in.nextInt(), in.nextInt()));
	}
}
