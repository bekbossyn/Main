public class Monotonic {

    public boolean isMonotonic(int[] ns) {
        boolean monotonic = true;
        for (int i = 0; i < ns.length - 1; i++) {
            if (!(ns[i] <= ns[i + 1])) {
                monotonic = false;
                break;
            }
        }
        if (!monotonic) {
            for (int i = 0; i < ns.length - 1; i++) {
                if (!(ns[i] >= ns[i + 1])) {
                    return false;
                }
            }
        }
        return true;
    }

}
