public class HammingDistance {

    public int hammingDistance(int x, int y) {
        StringBuilder xs = new StringBuilder(Integer.toBinaryString(x));
        StringBuilder ys = new StringBuilder(Integer.toBinaryString(y));
        while (xs.length() < ys.length()) xs.insert(0, "0");
        while (xs.length() > ys.length()) ys.insert(0, "0");
        int cnt = 0;
        for (int i = 0; i < xs.length(); i++)
            if (xs.charAt(i) != ys.charAt(i)) cnt++;
        return cnt;
    }

}
