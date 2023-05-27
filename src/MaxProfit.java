public class MaxProfit {

    public int maxProfit(int[] prices) {
        int max = 0;
        int minIndex = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length - 1; i++) {
            max = Math.max(max, prices[i] - min);
            if (prices[i] < min) {
                minIndex = i;
                min = prices[i];
            }
        }
        return Math.max(max, prices[prices.length - 1] - prices[minIndex]);
    }

}
