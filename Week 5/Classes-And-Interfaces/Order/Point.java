public class Point implements Order
{
	private double x, y;

	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}


	public Point midpoint(Point otherPoint)
	{
		return new Point((x + otherPoint.x)/2, (y + otherPoint.y)/2);
	}


	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}

	//DISTANCE FROM THE ORIGIN
	public boolean lessThan(Order other)
	{
		//HAVE TO CAST other TO A POINT
		Point otherPoint = (Point) other;

		double distance1 = x*x + y*y;
		double distance2 = otherPoint.getX() * otherPoint.getX() + otherPoint.getY() * otherPoint.getY();

		if (distance1 < distance2)
		{
			return true;
		}
		return false;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}
}
