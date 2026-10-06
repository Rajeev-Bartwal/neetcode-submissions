class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        // int min = Integer.MAX_VALUE;
        // for(int i=0;i<prices.length;i++){
        //    min = Math.min(prices[i] , min);;

        //    max = Math.max(max , prices[i] - min);
        // }
        // return max;

        int i=0;

        for(int j=1;j<prices.length;j++){

            if(prices[i] < prices[j]) max = Math.max(max , prices[j] - prices[i]);
            else i = j;
        }
        return max;
    }
}
