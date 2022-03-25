public class DiagonalSum {

    public int diagonalSum(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++){
            sum += m[i][i];
            if (i != m.length - i - 1) sum+= m[i][m.length - i - 1];
        }
        return sum;
    }

}
