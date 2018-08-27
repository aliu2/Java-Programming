public class Period
{
	private Time startTime;
	private Time endTime;

	public Period(Time t1, Time t2)
	{
		startTime = t1;
		endTime = t2;
	}

	public boolean overlaps(Period p2)
	{
		if (p2.getStartTime().isLater(startTime) && endTime.isLater(p2.getStartTime()))
		{
			return true;
		}
		else if (startTime.isLater(p2.getStartTime()) && p2.getEndTime().isLater(startTime))
		{
			return true;
		}
		return false;
	}

	public String toString()
	{
		return startTime.toString() + " -> " + endTime.toString();
	}

	public Time getStartTime()
	{
		return startTime;
	}

	public Time getEndTime()
	{
		return endTime;
	}
}
