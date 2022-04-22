public class Maximum69Number {

    public int maximum69Number (int n) {
        StringBuilder s = new StringBuilder(String.valueOf(n));
        for (int i = 0; i < s.length();i++){
            if (s.charAt(i)=='6'){
                s.setCharAt(i,'9');
                return Integer.parseInt(s.toString());
            }
        }
        return n;
    }

}
