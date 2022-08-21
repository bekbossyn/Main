public class MinNumberOfHours {

    public int minNumberOfHours(int iEnergy, int iExp, int[] en, int[] ex) {
        int total = 0;
        int sum = 0;
        for (int j : en) sum += j;
        if (iEnergy <= sum) total += sum - iEnergy + 1;
        // System.out.println("total: " + total);
        for (int i = 0; i < en.length; i++) {
//            boolean used = false;
            while (iExp <= ex[i]) {
//                used = true;
                total++;
                iExp++;
            }
//            if (!used) {
            iExp += ex[i];
            // System.out.println("Cur exp : " + iExp);
//            }
        }
        return total;
    }

}
