package edu.rit.se;

public class ColorCymk implements Color
{
	public final double c, y, m, k;

	/**
	 * <p>
	 * Each of the parameters c, y, m, and k is a fractional number between
	 * 0 and 1.
	 * </p>
	 */
	public ColorCymk(double c, double y, double m, double k)
	{
		this.c = c;
		this.y = y;
		this.m = m;
		this.k = k;
	}

	@Override
	public ColorCymk toCymk()
	{
		return this;
	}

	@Override
	public ColorHex toHex() throws ColorException
	{
        int[] values = this.getRGB();

        String hexString = "";
        hexString += Integer.toHexString(values[0]);
        hexString += Integer.toHexString(values[1]);
        hexString += Integer.toHexString(values[2]);

		return new ColorHex(hexString);
	}

	@Override
	public ColorRgb toRgb()
    {
        int[] values = this.getRGB();
		return new ColorRgb(values[0], values[1], values[2]);
	}

    private int[] getRGB()
    {
        int c = (int) this.c;
        int k = (int) this.k;
        int m = (int) this.m;
        int y = (int) this.y;

        int red = 255 * (1 - c) * (1 - k);
        int green = 255 * (1 - m) * (1 - k);
        int blue = 255 * (1 - y) * (1 - k);

        return new int[] {red, green, blue};
    }

	@Override
	public String toString()
	{
		String result;
		result = String.format("(c:%.3f,y:%.3f,m:%.3f,k:%.3f)", c, y,
			m, k);

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * 
	 * Since floating-point numbers are involved, equality must be
	 * determined within some acceptable error.
	 */
	@Override
	public boolean equals(Object o)
	{
		final double epsilon = .01;

		if (o instanceof ColorCymk) {
			ColorCymk that = (ColorCymk) o;

			boolean result = true;
			result &= Math.abs(this.c - that.c) < epsilon;
			result &= Math.abs(this.y - that.y) < epsilon;
			result &= Math.abs(this.m - that.m) < epsilon;
			result &= Math.abs(this.k - that.k) < epsilon;

			return result;
		} else {
			return false;
		}
	}
}
