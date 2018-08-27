public class Main
{
	public static void main(String[] args)
	{
		Time t1 = new Time("0732");
		Time t2 = new Time("0833");

		Time t3 = new Time("0735");
		Time t4 = new Time("1234");

		Period p1 = new Period(t1, t2);
		Period p2 = new Period(t3, t4);

		if (p1.overlaps(p2))
		{
			System.out.println("overlaps");
		}
		else
		{
			System.out.println("doesn't overlap");
		}
	}
}
