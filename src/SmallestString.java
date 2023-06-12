public class SmallestString {

    public String smallestString(String s) {
        int len = s.length(), indexI = -1, indexF = -1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != 'a') {
                indexI = i;
                break;
            }
        }
        if (indexI == -1) {
            if (s.length() == 1) return "z";
            StringBuilder sb = new StringBuilder();
//            sb.append('z');
            for (int i = 1; i < len; i++) sb.append('a');
            sb.append('z');
            return sb.toString();
        }
        for (int i = indexI + 1; i < len; i++)
            if (s.charAt(i) == 'a') {
                indexF = i;
                break;
            }
        if (indexF == -1) indexF = len;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indexI; i++) sb.append(s.charAt(i));
        for (int i = indexI; i < indexF; i++) {
            if (s.charAt(i) == 'z') {
                sb.append('a');
            } else {
                sb.append((char) (s.charAt(i) - 1));
            }
        }
        for (int i = indexF; i < len; i++) sb.append(s.charAt(i));
        return sb.toString();
    }
}
