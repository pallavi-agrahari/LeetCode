class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Loop through each day's price
        for (int i = 0; i < prices.length; i++) {
            // Update minimum price if a lower price is found
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Calculate profit for the current price by subtracting minimum price
            int profit = prices[i] - minPrice;
            // Update maximum profit if the current profit is higher
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        // Return the maximum profit found
        return maxProfit;
        
    }
}