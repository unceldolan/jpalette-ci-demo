package edu.rit.se;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorCymkTest
{
	@Test
	public void testToCymkReflexive()
	{
		ColorCymk col1 = new ColorCymk(0.0, 0.0, 0.0, 0.0);
		assertEquals(col1, col1.toCymk());

		ColorCymk col2 = new ColorCymk(0.11, 0.11, 0.11, 0.11);
		assertNotSame(col2, col1);
	}

	@Test
	public void testToHex()
	{
		ColorCymk cymk = new ColorCymk(0.0, 0.0, 0.0, 0.0);
		ColorHex hex;
		try {
			hex = new ColorHex("FFFFFF");
			assertEquals(hex, cymk.toHex());
		} catch (ColorException e) {
			fail(e.getMessage());
		}

		ColorCymk cymk1 = new ColorCymk(0.1, 0.1, 0.1, 0.1);
		ColorHex hex1;
		try {
			hex1 = new ColorHex("CECECE");
			assertEquals(hex1, cymk1.toHex());
		} catch (ColorException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testToRgb()
	{
		ColorCymk cymk = new ColorCymk(0.0, 0.0, 0.0, 0.0);
		ColorRgb rgb = new ColorRgb(255, 255, 255);

		assertEquals(rgb, cymk.toRgb());

		ColorCymk cymk1 = new ColorCymk(0.1, 0.1, 0.1, 0.1);
		ColorRgb rgb1 = new ColorRgb(206, 206, 206);

		assertEquals(rgb1, cymk1.toRgb());
	}
}
