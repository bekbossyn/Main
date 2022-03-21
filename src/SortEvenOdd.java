public class SortEvenOdd {

    public int[] sortEvenOdd(int[] ns) {
        int t;
        for (int j = 0; j < ns.length; j++) {
            for (int i = 0; i < ns.length - 1; i++) {
                if (i + 2 < ns.length) {
                    if (i % 2 == 0) {
                        if (ns[i] > ns[i + 2]) {
                            t = ns[i];
                            ns[i] = ns[i + 2];
                            ns[i + 2] = t;
                        }
                    } else {
                        if (ns[i] < ns[i + 2]) {
                            t = ns[i];
                            ns[i] = ns[i + 2];
                            ns[i + 2] = t;
                        }
                    }
                }
            }
        }
        return ns;
    }

}
