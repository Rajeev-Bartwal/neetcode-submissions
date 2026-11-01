class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;
        int min = prices[0];

        for(int j=1;j<prices.length;j++){
            if(min < prices[j]){ 
                max = Math.max(max , prices[j] - min);
            }else min = prices[j];
        }

        return max;
    }
}
