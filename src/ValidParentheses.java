class ValidParentheses {
    public boolean isValid(String s) {
        int i = -1;
        char[] stack = new char[10000];
        int st = 0;
        while (i < s.length() - 1) {
            i++;
            if (st < 0) return false;
            if (s.charAt(i) == '(') {
                stack[st++] = ')';
            } else if (s.charAt(i) == '{') {
                stack[st++] = '}';
            } else if (s.charAt(i) == '[')  {
                stack[st++] = ']';
            } else {
                if (st == 0) return false;
                if (stack[st - 1] != s.charAt(i)) {
                    return false;
                }
                st--;
            }
        }
        return st == 0;
    }
}
