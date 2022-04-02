public class TriangularSum {

    public int triangularSum(int[] ns) {
        if (ns.length == 1) return ns[0];
        int[] ns1 = new int[ns.length - 1];
        for (int i = 0; i < ns1.length; i++) ns1[i] = (ns[i] + ns[i + 1]) % 10;
        return triangularSum(ns1);
    }

}
