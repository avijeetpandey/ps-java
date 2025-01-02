package leetcode;

public class StocksBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int answer = 0;
        int minSoFar = prices[0];

        for(int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minSoFar;
            if(profit > answer) {
                answer = profit;
            }

            minSoFar = Math.min(minSoFar, prices[i]);
        }

        System.out.println(answer);
    }
}
