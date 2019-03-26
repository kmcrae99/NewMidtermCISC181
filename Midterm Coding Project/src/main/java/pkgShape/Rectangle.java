package pkgShape;

import java.util.Comparator;

public class Rectangle extends Shape implements Comparator<Shape> {
	public int Width;
	public int Length;
	
	public Rectangle()
	{
		
	}
	
	// Constructor
	public Rectangle(int length, int width) {
		super();
		Length = length;
		Width = width;
	}
	
	// getters and setters
	
	public int getWidth() {
		return Width;
	}
	
	public int getLength() {
		return Length;
	}
	
	public void setlength(int newlength) {
		
		if (newlength <= 0)
			throw new IllegalArgumentException();
			
		Length = newlength;
		
	}
	
	public void setWidth(int newwidth) {
		
		if (newwidth <= 0)
			throw new IllegalArgumentException();
			
		Width = newwidth;
	}
	
	public double area()
	{
		double Area = this.Length * this.Width;
		return Area;
	}
	
	public double perimeter()
	{
		return (double)this.Length * 2 + this.Width *2;
	}
	
	public double compare(Rectangle r1, Rectangle r2) {
		
		return r1.area() - r2.area();
	}
		
}