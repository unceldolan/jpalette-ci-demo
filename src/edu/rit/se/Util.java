package edu.rit.se;

/**
 * <p>
 * This class contains useful functions for this project
 * </p>
 * 
 * @author Steven Kroh (skk8768)
 */
public class Util
{
	/**
	 * This function returns the maximum of a variable list of elements
	 * 
	 * @param ts
	 *        A list of elements of generic type
	 * @return The maximal element
	 */
	@SuppressWarnings("unchecked")
	static public <T extends Comparable<T>> T varMax(T... ts)
	{
		if (ts.length == 0) { return null; }

		T max = ts[0];
		for (int i = 0; i < ts.length; i++) {
			if (ts[i].compareTo(max) > 0) {
				max = ts[i];
			}
		}

		return max;
	}
}
