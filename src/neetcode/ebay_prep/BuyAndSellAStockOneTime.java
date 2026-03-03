package neetcode.ebay_prep;

public class BuyAndSellAStockOneTime {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;

        int maxProfitObserved = 0;

        while(right < prices.length) {
            int currentPrice = prices[left];
            int futurePrice = prices[right];

            if(futurePrice > currentPrice) {
                maxProfitObserved = Math.max(maxProfitObserved, futurePrice - currentPrice);
            } else {
                left = right;
            }

            right++;
        }

        return maxProfitObserved;
    }

    public static void main(String[] args) {
        int[] prices = {10,8,7,5,2};
        System.out.println(maxProfit(prices));
    }
}
