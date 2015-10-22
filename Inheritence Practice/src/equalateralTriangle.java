public class equalateralTriangle extends Triangle
	{
	private double sideLength;
	public equalateralTriangle(double s, double q)
		{
		sideLength = s;
		base = s;
		height = q;
		}
	public double findPerimeter()
		{
		return sideLength * 3;
		}
	}
