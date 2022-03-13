class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minLength = strs[0].length();
        for (int i = 0; i < strs.length; i++)   {
            minLength = Math.min(minLength, strs[i].length());
        }
        String prefix = strs[0].substring(0,minLength);
        for (int i = 0; i < strs.length; i++)   {
            while (strs[i].indexOf(prefix) != 0 && prefix.length() > 0)    {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
