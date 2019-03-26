package pkgShape;

import java.util.Comparator;

public class SortByArea extends Cuboid implements Comparator<Shape> {
	
	public double compare(Cuboid cub1, Cuboid cub2) {
		
		return cub1.area() - cub2.area();
	}

}
