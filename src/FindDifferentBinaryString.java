import java.util.HashSet;

public class FindDifferentBinaryString {

    public String findDifferentBinaryString(String[] ns) {
        HashSet<Integer> h = new HashSet<>();
        for (String n : ns) h.add(Integer.parseInt(n, 2));
        int i = 0;
        while (h.contains(i)) i++;
        String res = Integer.toBinaryString(i);
        while (res.length() < ns.length) res = "0" + res;
        return res;
    }

}