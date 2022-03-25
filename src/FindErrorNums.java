public class FindErrorNums {

    public int[] findErrorNums(int[] ns) {
        int duplicate = 0;
        int missing = ns.length * (ns.length + 1) / 2;

        for (int n : ns) {
            if (ns[Math.abs(n) - 1] < 0) duplicate = Math.abs(n);
            else ns[Math.abs(n) - 1] *= -1;
        }
        for (int i = 0; i < ns.length; i++)
            if (ns[i] > 0) missing = i + 1;
        return new int[]{duplicate, missing};
    }

    /*
    public int[] findErrorNums(int[] ns) {
        int[] ms = new int[ns.length];
        for (int i = 0; i < ns.length; i++) ms[i] = i + 1;
        int missing = ns.length * (ns.length + 1) / 2;
        int duplicate = 0;
        for (int n : ns) {
            if (ms[n - 1] == 0) {
                duplicate = n;
            } else {
                missing -= n;
                ms[n - 1] = 0;
            }
        }
        return new int[]{duplicate, missing};
    }
    */

}
