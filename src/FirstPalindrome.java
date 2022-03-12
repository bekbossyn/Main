class FirstPalindrome	{
	public String firstPalindrome(String[] words)	{
		String mypal = "";
		for (String i:words)	{
			boolean ispal = true;
			for (int j = 0; j <= i.length() / 2; j++)	{
				if (i.charAt(j) != i.charAt(i.length() - j - 1))	{
					ispal = false;
				}
			}
			if (ispal == true)	{
				return i;
			}	
		}
		return "";
	}
}