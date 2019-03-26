package pkgShape;

public class Cuboid extends Rectangle {
	public int Depth;
	
	public Cuboid(){
		
	}
	
	public Cuboid(int length, int width, int depth) {
		super();
		Length = length;
		Width = width;
		Depth = depth;
	}
	
	public int getDepth() {
		return Depth;
	}
	
	public void setDepth(int newdepth) {
		if (newdepth <= 0)
			throw new IllegalArgumentException();
			
		Depth = newdepth;
	}
	
	
	// Compute Surface Area
	
	@Override
	public double area()
	{
		return (double)this.Length * this.Width * 6;
	}
	
	public double volume()
	{
		return (double)this.Width * this.Length * this.Depth;
	}
	
	public double perimeter() {
		throw new UnsupportedOperationException();
	}

}


