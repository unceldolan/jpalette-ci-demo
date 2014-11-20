package edu.rit.se;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SwatchTest
{
	private Swatch sw;

	@Before
	public void setUp() throws Exception
	{
		sw = SwatchFactory.empty("test");
		sw.addColor(new ColorRgb(125, 125, 125));
		sw.addColor(new ColorHex("CCCCCC"));
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testContains()
	{
		try {
			assertTrue(sw.contains(new ColorRgb(125, 125, 125)));
			assertFalse(sw.contains(new ColorHex("CDCDCD")));
		} catch (ColorException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testRemoveColor()
	{
		assertNotNull(sw.removeColor(new ColorRgb(125, 125, 125)));
		assertFalse(sw.contains(new ColorRgb(125, 125, 125)));

		assertNull(sw.removeColor(new ColorRgb(0, 0, 0)));
	}

	@Test
	public void testAddColorLevel1()
	{
		assertTrue(sw.addColor(new ColorRgb(50, 50, 50)));
		assertTrue(sw.addColor(new ColorRgb(50, 50, 50)));
	}

	@Test
	public void testAddColorLevel2()
	{
		assertTrue(sw.addColor(new ColorRgb(50, 50, 50)));
		assertFalse(sw.addColor(new ColorRgb(50, 50, 50)));

		try {
			assertTrue(sw.addColor(new ColorRgb(75, 75, 75)));
			assertFalse(sw.addColor(new ColorHex("4B4B4B")));
		} catch (ColorException e) {
			fail(e.getMessage());
		}

		assertTrue(sw.addColor(new ColorCymk(.1, .1, .1, .1)));
		assertFalse(sw.addColor(new ColorRgb(206, 206, 206)));
	}
}
