public class CheckZeroOnes {

    public boolean checkZeroOnes(String s) {
        int max1 = 0, max0 = 0, cnt1 = 0, cnt0 = 0;
        char prev = s.charAt(0);
        if (s.charAt(0) == '0') {
            max0++;
            cnt0++;
        } else {
            max1++;
            cnt1++;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0' && prev == '0') {
                cnt0++;
                cnt1 = 0;
            } else if (s.charAt(i) == '1' && prev == '1') {
                cnt1++;
                cnt0 = 0;
            } else if (s.charAt(i) == '1') {
                cnt0 = 0;
                cnt1 = 1;
            } else {
                cnt0 = 1;
                cnt1 = 0;
            }
            max0 = Math.max(max0, cnt0);
            max1 = Math.max(max1, cnt1);
            prev = s.charAt(i);
        }
        return max1 > max0;
    }

}
