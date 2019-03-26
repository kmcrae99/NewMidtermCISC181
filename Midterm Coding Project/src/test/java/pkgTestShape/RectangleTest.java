package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class RectangleTest {
	
	
	@Test
	public void area_test() {
		
		Rectangle rec1 = new Rectangle(1,2);

		double aExpected = rec1.Length * rec1.Width;
		double aActual = rec1.area();
		
		assertEquals(aExpected,aActual,0);
			
	}
	
	@Test
	public void Constructor_Test() {
		Rectangle rec2 = new Rectangle(2,3);
		Rectangle rExpected = new Rectangle(2,3);
		Rectangle rActual = rec2;
		
		assertEquals(rExpected,rActual);
		
	}
	
	@Test
	public void perimeter_test() {
		Rectangle rec3 = new Rectangle(2,1);
		
		double pExpected = rec3.Length * 2 + rec3.Width *2;
		double pActual = rec3.perimeter();
		
		assertEquals(pExpected,pActual,0);
			
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void SetterTest() throws Exception {
	    new Rectangle(-1,-2);
	}

}
