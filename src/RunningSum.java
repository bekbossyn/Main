public class RunningSum {

    public int[] runningSum(int[] ns) {
        int[] nss = new int[ns.length];
        nss[0] = ns[0];
        for (int i = 1; i < ns.length; i++)
            nss[i] = nss[i - 1] + ns[i];
        return nss;
    }

}
