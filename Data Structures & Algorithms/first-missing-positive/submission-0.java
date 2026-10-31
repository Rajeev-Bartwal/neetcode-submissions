class Solution {
    public int firstMissingPositive(int[] nums) {
        int ans  = 1;
        for(int i=1;i<nums.length;i++){
            for(int num : nums){
                if(num == i){
                    ans++;
                    break;
                }
            }
        }

        return ans;
    }
}