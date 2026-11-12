class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int prof = 0;
        int min = prices[0];
        for(int i = 1; i < n; i++){
            int sell = prices[i];
            int cost = sell - min;
            prof = Math.max(prof, cost);
            min = Math.min(min, prices[i]);
        }
        return prof;
    }
}