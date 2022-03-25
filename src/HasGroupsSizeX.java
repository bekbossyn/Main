import java.util.HashMap;

public class HasGroupsSizeX {

    public boolean hasGroupsSizeX(int[] d) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int n : d) {
            h.put(n, h.getOrDefault(n, 0) + 1);
        }
        int mini = 0;
        for (int n : d) {
            mini = gcd(mini, h.get(n));
        }
        return mini > 1;
    }

    int gcd(int a, int b) {
        int c;
        while (b > 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

}
