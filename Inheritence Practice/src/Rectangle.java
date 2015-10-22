public class Rectangle extends Quadrilateral
	{
	private double length;
	private double width;
	public Rectangle(double d, double p)
		{
		length = d;
		width = p;
		}
	public double findArea()
		{
		return (length * 2) + (width * 2);
		}
	public double findPerimeter()
		{
		return length * width;
		}
	}
