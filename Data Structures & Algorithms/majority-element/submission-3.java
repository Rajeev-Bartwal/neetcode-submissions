class Solution {
    public int majorityElement(int[] nums) {
        int num = nums[0];
        int c = 0;

        for(int i : nums){
            if(c == 0){
                num = i;
            }

            c += (num == i) ? 1 : -1;
        }
        return num;
    }
}