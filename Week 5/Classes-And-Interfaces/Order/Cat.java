public class Cat implements Order
{
	private String name;

	public Cat(String n)
	{
		name = n;
	}

	public String toString()
	{
		return "Cat: " + name;
	}

	public boolean lessThan(Order other)
	{
		Cat otherCat = (Cat) other;
		if (name.length() < otherCat.getName().length())
		{
			return true;
		}
		return false;
	}

	public String getName()
	{
		return name;
	}
}
