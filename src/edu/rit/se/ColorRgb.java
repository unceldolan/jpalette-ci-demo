package edu.rit.se;

public class ColorRgb implements Color
{
	private final int r, g, b;

	public ColorRgb(int r, int g, int b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}

	@Override
	public ColorCymk toCymk()
	{
		/* Implement this */

		/*
		 * Hint: when dividing two integers, you need to cast the
		 * divisor and dividend to floating-point numbers (doubles)
		 */

		/*
		 * Hint: use Util.varMax() where max() is used in the formula
		 */

		return new ColorCymk(0, 0, 0, 0);
	}

	@Override
	public ColorHex toHex() throws ColorException
	{
		/* Implement this */

		/*
		 * Hint: Integer.toHexString()
		 */

		return new ColorHex("000000");
	}

	@Override
	public ColorRgb toRgb()
	{
		/* Implement this */

		return new ColorRgb(0, 0, 0);
	}

	@Override
	public String toString()
	{
		String result;
		result = String.format("(r:%d,g:%d,b:%d)", r, g, b);

		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof ColorRgb) {
			ColorRgb that = (ColorRgb) o;

			return (this.r == that.r) && (this.g == that.g)
				&& (this.b == that.b);
		} else {
			return false;
		}
	}
}
