import java.util.Arrays;

public class BuyChoco {

    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int mmm = money;
        money -= (prices[0] + prices[1]);
        if (money < 0) money = mmm;
        return money;
    }

}
