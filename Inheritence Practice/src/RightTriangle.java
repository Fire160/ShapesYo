public class RightTriangle extends Triangle
	{
	private double hypotenuse;
	public RightTriangle(double s, double q)
		{
		base = s;
		height = q;
		}
	public double findHypotenuse()
		{
		return Math.sqrt((base * base) + (height * height)) ;
		}
	public double findPerimeter()
		{
		return base + height + hypotenuse;
		}
	}
