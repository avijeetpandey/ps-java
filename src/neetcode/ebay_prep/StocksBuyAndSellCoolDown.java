package neetcode.ebay_prep;

public class StocksBuyAndSellCoolDown {
    public static int maxProfit(int[] prices) {
        int n = prices.length - 1;
        int nextBuy = 0;
        int nextSell = 0;
        int nextNextBuy = 0;

        for(int i = n; i>= 0; i--) {
            int currentBuy = Math.max(nextSell - prices[i], nextBuy);
            int currentSell = Math.max(nextNextBuy + prices[i], nextSell);

            nextNextBuy = nextBuy;
            nextBuy = currentBuy;
            nextSell = currentSell;
        }

        return nextBuy;
    }


    public static void main(String[] args) {
        int[] prices = {1,3,4,0,4};
        System.out.println(maxProfit(prices));
    }
}
