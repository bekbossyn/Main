/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/13
[HH:MM:SS]      23:35:47
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixSum {

    public int matrixSum(int[][] ns) {
        List<List<Integer>> list = new ArrayList<>();
        int n = ns.length;
        int m = ns[0].length;
        for (int i = 0; i < n; i++) {
            Arrays.sort(ns[i]);
        }
        int sum = 0;
        for (int j = 0; j < m; j++) {
            int max = -1;
            for (int i = 0; i < n; i++) {
                if (max < ns[i][j]) {
                    max = ns[i][j];
                }
            }
            sum += max;
        }
        return sum;
    }

}
