/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      16:59:22
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetPermutation {

    public String getPermutation(int n, int k) {
        int fac = 1;
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) list.add(i);
        for (int i = 1; i <= n; i++) fac *= i;
        // fac is now 24 for n = 4
        k--;// positioning from 0
        int curN = n;
        while (k > 0) {
            int frac = fac / curN;
            int num = k / frac;
            int myNumber = list.get(num);
            answer.add(myNumber);
            list.remove(num);
            k %= frac;
            fac /= curN--;
        }
        while (list.size() > 0) {
            int num = list.get(0);
            answer.add(num);
            list.remove(0);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.size(); i++)
            sb.append(answer.get(i));

        return sb.toString();
    }

}
