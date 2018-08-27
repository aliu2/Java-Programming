public class Time
{
	private String hours;
	private String minutes;

	public Time(String time)
	{
		hours = time.substring(0,2);
		minutes = time.substring(2, 4);
	}


	public boolean isLater(Time otherTime)
	{
		int otherHours = Integer.parseInt(otherTime.getHours());
		int otherMinutes = Integer.parseInt(otherTime.getMinutes());
		int thisHours = Integer.parseInt(hours);
		int thisMinutes = Integer.parseInt(minutes);

		if (thisHours > otherHours)
		{
			return true;
		}
		else if (thisHours == otherHours)
		{
			if (thisMinutes > otherMinutes)
			{
				return true;
			}
		}
		return false;
	}


	public String toString()
	{
		return hours + ":" + minutes;
	}


	public String getHours()
	{
		return hours;
	}


	public String getMinutes()
	{
		return minutes;
	}
}
