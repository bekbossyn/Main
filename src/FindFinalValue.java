public class FindFinalValue {

    public int findFinalValue(int[] ns, int o) {
        for (int i = 0; i < ns.length; i++) {
            if (ns[i] == o) {
                return findFinalValue(ns, o * 2);
            }
        }
        return o;
    }

}
