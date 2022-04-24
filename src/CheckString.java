public class CheckString {

    public boolean checkString(String s) {
        int j = -1;
        if (!s.contains("a")) return true;
        if (s.charAt(0)!= 'a') return false;
        for (int i = 1; i < s.length();i++){
            if (s.charAt(i)=='b'){
                j=i;
            } else {
                if (j!=-1) return false;
            }
        }
        return true;
    }

}
