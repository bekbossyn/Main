public class NumberOfWeeks {

    public long numberOfWeeks(int[] milestones) {
        long sum = 0, max = milestones[0];
        for (int milestone : milestones) {
            sum += milestone;
            if (max < milestone) {
                max = milestone;
            }
        }
        sum -= max;
        return sum + Math.min(sum + 1, max);
    }

}
