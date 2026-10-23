class Solution {
    public int maxProfit(int[] nums) {
        int maxProfit = 0;
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            if(min > nums[i]) min = nums[i];
            else{
                maxProfit += nums[i] - min;
                min = nums[i];
            }
        }

        return maxProfit;
    }
}