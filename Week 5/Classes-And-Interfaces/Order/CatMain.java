public class CatMain
{
	public static void main(String[] args)
	{
		Cat bill = new Cat("James");
		Cat john = new Cat("Elizabeth");

		if (bill.lessThan(john))
		{
			System.out.println(bill + " is less");
		}
		else
		{
			System.out.println(john + " is less");
		}
	}
}
