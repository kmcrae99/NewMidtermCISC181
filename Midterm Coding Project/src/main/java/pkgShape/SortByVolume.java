package pkgShape;

import java.util.Comparator;

public class SortByVolume extends Cuboid implements Comparator<Shape> {
	
	public double compare(Cuboid cub3, Cuboid cub4) {
			
		return cub3.volume() - cub4.volume();
		}
}
