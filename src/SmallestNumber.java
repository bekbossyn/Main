public class SmallestNumber {

    public String smallestNumber(String p) {
        p = "I" + p;
        String s = "123456789";
        int q = 0;
        if (p.charAt(0) == 'D') {
            int cnt = 1;
            q = 1;
            while (q < p.length() && p.charAt(q) == 'D') q++;
            StringBuilder sb = new StringBuilder(s.substring(0, q));
            sb.reverse();
            s = sb.toString() + s.substring(q);

        }
        int i = q;
        while (i < p.length()) {
            if (p.charAt(i) == 'D') {
                int pos = i - 1;
                while (i < p.length() && p.charAt(i) == 'D') i++;
//                if
                StringBuilder sb = new StringBuilder(s.substring(pos, i));
                sb.reverse();
//                if (i >= p.length()) break;

                s = s.substring(0, pos) + sb.toString() + s.substring(i);
            } else i++;
        }
        return s.substring(0, p.length());
    }

}
