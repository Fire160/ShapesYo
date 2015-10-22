import java.util.ArrayList;

public class Runner
	{
	public static void main(String[] args)
		{
		equalateralTriangle equTri = new equalateralTriangle(3.0,7.0);
		System.out.println("+------(Equalateral Triangle)-----+");
		System.out.println("[PERIMETER] " + equTri.findPerimeter());
		System.out.println("[AREA] " + equTri.findArea());
		Rectangle rect = new Rectangle(5.0,4.0);
		System.out.println("+------(Equalateral Triangle)-----+");
		System.out.println("[PERIMETER] " + rect.findPerimeter());
		System.out.println("[AREA] " + rect.findArea());
		equalateralTriangle rightTri = new equalateralTriangle(5.0,12.0);
		System.out.println("+------(Right Triangle)-----+");
		System.out.println("[PERIMETER] " + rightTri.findPerimeter());
		System.out.println("[AREA] " + rightTri.findArea());
		Trapezoid trap = new Trapezoid(3.0, 7.0, 2.0);
		System.out.println("+------(Equalateral Triangle)-----+");
		System.out.println("[PERIMETER] " + trap.findPerimeter());
		System.out.println("[AREA] " + trap.findArea());
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		}
	}
