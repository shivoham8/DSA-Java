1class Solution {
2    public int maxProfit(int[] prices) {
3        int bestBuy = prices[0];
4        int maxProfit = 0;
5        for (int i = 0; i < prices.length; i++) {
6            if (prices[i] > bestBuy) {
7                maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
8            }
9            bestBuy = Math.min(bestBuy, prices[i]);
10        }
11        return maxProfit;
12    }
13}