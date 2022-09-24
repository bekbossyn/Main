import java.util.HashMap;

public class ToHex {

    public String toHex(int n) {
        long nn = n;
        if (n == 0) return "0";
        if (n < 0) nn += Math.pow(2, 32);
        HashMap<Integer, String> h = new HashMap<>();
        for (int i = 0; i < 16; i++) {
            if (i < 10) h.put(i, String.valueOf(i));
            else h.put(i, String.valueOf((char) (i + 'a' - 10)));
        }
        StringBuilder s = new StringBuilder();
        while (nn > 0) {
            System.out.println(nn);
            s.append(h.get((int) (nn % 16)));
            System.out.println(s);
            nn /= 16;
        }
        System.out.println(h);
        return s.reverse().toString();
    }

}
