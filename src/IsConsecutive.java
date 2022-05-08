import java.util.Arrays;

public class IsConsecutive {

    public boolean isConsecutive(int[] ns) {
        Arrays.sort(ns);
        for (int i = 0; i < ns.length - 1; i++)
            if (ns[i] + 1 != ns[i + 1]) return false;
        return true;
    }

}
