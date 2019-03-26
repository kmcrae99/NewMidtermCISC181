package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class CuboidTest {

	@Test
	public void CuboidTest1() {
		try {
			Cuboid c1 = new Cuboid(1, 1, 1);
		} catch (Exception e) {
			fail("Test failed to implement");
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void CuboidTest2() throws Exception {

		Cuboid c2 = new Cuboid(1,1,-1);

	}
	
	@Test
	public void CuboidAreaTest() {
		Cuboid c5 = new Cuboid(1,2,3);

		double acExpected = c5.Length * c5.Width * 6;
		double acActual = c5.area();
		
		assertEquals(acExpected,acActual,0);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void cub_perimeter_test() throws Exception {
		Cuboid c6 = new Cuboid(2,2,2);
		double perCub = c6.perimeter();
		
			
	}
	

	
}
