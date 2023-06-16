import java.util.Arrays;

public class CreateTargetArray {

    public int[] createTargetArray(int[] ns, int[] in) {
        int len = ns.length;
        int[] target = new int[len];
        Arrays.fill(target, -1);
        for (int i = 0; i < len; i++) {
            if (target[in[i]] != -1) {
                for (int j = len - 1; j > in[i]; j--) {
                    target[j] = target[j - 1];
                }
            }
            target[in[i]] = ns[i];
        }
        return target;
    }

}
