public class Date
{
	private int day;
	private int month;
	private int year;


	public Date()
	{
		this.day = 1;
		this.month = 1;
		this.year = 2000;
	}


	public Date(String date)
	{
		String[] arrDate = date.split(" ");
		this.day = Integer.parseInt(arrDate[0]);
		this.month = Integer.parseInt(arrDate[1]);
		this.year = Integer.parseInt(arrDate[2]);
	}


	public boolean isOnOrAfter(Date otherDate)
	{
		int otherDay = otherDate.getDay();
		int otherMonth = otherDate.getMonth();
		int otherYear = otherDate.getYear();

		if (year > otherYear)
		{
			return true;
		}
		else if (year == otherYear)
		{
			if (month > otherMonth)
			{
				return true;
			}
			else if (month == otherMonth)
			{
				if (day >= otherDay)
				{
					return true;
				}
			}
		}
		return false;
	}


	public String toString()
	{
		return day + "/" + month + "/" + year;
	}


	public int getDay()
	{
		return day;
	}


	public int getMonth()
	{
		return month;
	}


	public int getYear()
	{
		return year;
	}
}
