import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {
	private double area;
	private double perimeter;
	private Object getArea() {
		// TODO Auto-generated method stub
		double side1 = 5.3;
		double side2 = 4.2;
		double side3 = 3.1;
		area = (side1 + side2 + side3)/2;
		return area;
	}
	
	private Object getPerimeter() {
		// TODO Auto-generated method stub
		double side1 = 5.3;
		double side2 = 4.2;
		double side3 = 3.1;
		perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetArea() {
		assertEquals("area",6.3, getArea());
	}

	@Test
	public void testGetPerimeter() {
		assertEquals("perimeter", 12.6, getPerimeter());
	}

	
	
}
