package edu.rit.se;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorHexTest
{
	@Test
	public void testToHexReflexive()
	{
		ColorHex hex;
		try {
			hex = new ColorHex("FFFFFF");
			assertEquals(hex, hex.toHex());

			ColorHex hex1 = new ColorHex("CECECE");
			assertEquals(hex1, hex1);

		} catch (ColorException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testToRgb()
	{
		ColorRgb rgb = new ColorRgb(255, 255, 255);
		ColorHex hex;
		try {
			hex = new ColorHex("FFFFFF");
			assertEquals(rgb, hex.toRgb());
		} catch (ColorException e) {
			fail(e.getMessage());
		}

		ColorRgb rgb1 = new ColorRgb(206, 206, 206);
		ColorHex hex1;
		try {
			hex1 = new ColorHex("CECECE");
			assertEquals(rgb1, hex1.toRgb());
		} catch (ColorException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testToCymk()
	{
		ColorCymk cymk = new ColorCymk(0.0, 0.0, 0.0, 0.0);
		ColorHex hex;
		try {
			hex = new ColorHex("FFFFFF");
			assertEquals(cymk, hex.toCymk());
		} catch (ColorException e) {
			fail(e.getMessage());
		}

		/* Don't worry about this case */

		// ColorRgb rgb1 = new ColorRgb(206, 206, 206);
		// ColorCymk cymk1 = new ColorCymk(0.1, 0.1, 0.1, 0.1);
		//
		// assertEquals(cymk1, rgb1.toCymk());
	}
}
