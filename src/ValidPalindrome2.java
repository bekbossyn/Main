class ValidPalindrome2	{
	public boolean validPalindrome2(String s)	{
		if (s.length() < 2) return true;
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.substring(0,i)+s.substring(i+1, s.length()));
			if (palindrome(s.substring(0,i)+s.substring(i+1, s.length())))	{
				System.out.println(s.substring(0,i)+s.substring(i, s.length()));
				return true;
			}
		}
		return palindrome(s);
	}

	boolean palindrome(String s)	{
		for (int i = 0; i <= (s.length() / 2); i++)	{
			if (s.charAt(i) != s.charAt(s.length() - i - 1))	{
				return false;
			}
		}
		return true;
	}
}