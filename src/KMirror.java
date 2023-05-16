/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/16
[HH:MM:SS]      01:17:45
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KMirror {

    private static long[] pow = new long[32];

    private static int base, oddEven;
    private static List<Integer> evens;
    private static List<Integer> odds;

    private void next(List<Integer> number) {
        //  increasing number
//        number[0]++;
        number.set(0, (number.get(0) + 1));
        int rem = 0;
        for (int i = 0; i < number.size(); i++) {
            rem = rem + number.get(i);
            number.set(i, rem % base);
            rem /= base;
//            number.set(i + 1, (number.get(i + 1) + 1));
//            pair.number.num[i + 1]++;
        }
        if (rem > 0) number.add(rem);
    }

    public long kMirror(int k, int n) {

        //  setting power array to use
        pow = new long[32];
        long p = 1;
        for (int i = 0; i < pow.length; i++) {
            pow[i] = p;
            p *= k;
        }

        //  setting the base
        base = k;

        //  list for ODDs
        odds = new ArrayList<>();
        odds.add(1);

        //  list for EVENs
        evens = new ArrayList<>();
        evens.add(1);

        //  first number is 1 always
        long result = 0;
        for (int i = 1; i < k; i++) {
            result += i;
            n--;
            if (n == 0) break;
        }


        //  setting ODD or EVEN
        // odd = 1
        // even = 0
        oddEven = 0;


        while (n > 0) {
            if (oddEven == 0) {

                //  convert to 10 based
                long num = 0;
                int ind = 0;

                for (int j = evens.size() - 1; j >= 0; j--) {
                    num += pow[ind++] * evens.get(j);
                }

                for (int j = 0; j < evens.size(); j++) {
                    num += pow[ind++] * evens.get(j);
                }

                // check if 10 based number is mirror
                if (is10Mirror(num)) {
                    result += num;
                    n--;
                    if (n == 0) break;
                }
                next(evens);
                if (evens.size() != odds.size()) {
                    oddEven = (oddEven + 1) % 2;
                    odds = new ArrayList<>(evens);
                }
            }

            if (oddEven == 1) {

                //  convert to 10 based
                long num = 0;
                int ind = 0;

                for (int j = odds.size() - 1; j >= 0; j--) {
                    num += pow[ind++] * odds.get(j);
                }

                for (int j = 1; j < odds.size(); j++) {
                    num += pow[ind++] * odds.get(j);
                }


                // check if 10 based number is mirror
                if (is10Mirror(num)) {
                    result += num;
                    n--;
                    if (n == 0) break;
                }
                //  next number
                next(odds);
                if (evens.size() != odds.size()) {
                    oddEven = (oddEven + 1) % 2;
                    odds = new ArrayList<>(evens);
                }

            }
        }

        return result;
    }

    private boolean is10Mirror(long number) {
        String sb = String.valueOf(number);
        for (int i = 0, j = sb.length() - 1; i < j; i++, j--) {
            if (sb.charAt(i) != sb.charAt(j)) return false;
        }
        return true;
    }

    private boolean iskMirror(StringBuilder sb) {
        for (int i = 0, j = sb.length() - 1; i < j; i++, j--) {
            if (sb.charAt(i) != sb.charAt(j)) return false;
        }
        return true;
    }

}
