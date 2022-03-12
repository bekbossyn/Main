class Sqrt	{
	public int mySqrt(int x)	{
		long l = 0;
		long r = x;
		while (l < r)	{
			long mid = (l + r) / 2;
			if (mid * mid > x)	{
				r = mid - 1;
			} else {
				l = mid + 1;
			}
			// System.out.println(l + " " + r);
		}
		if (l * l <= x)
			return (int) l;
		return (int) l - 1;
	}
}