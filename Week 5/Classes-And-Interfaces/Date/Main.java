public class Main
{
	public static void main(String[] args)
	{
		Date[] arrDates = {
			new Date("1 1 1890"),
			new Date("1 1 2000"),
			new Date("2 1 2000"),
			new Date("30 12 1999")
		};

		Date latestDate = arrDates[0];

		for (Date date: arrDates)
		{
			if (date.isOnOrAfter(latestDate))
			{
				latestDate = date;
			}
		}
		System.out.println(latestDate);
	}
}
