class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){ 
                j = i;
                break;
            }    
        }

        if(i == nums.length-1) return i;

        for(int i = j;i<nums.length;i++){
            if(nums[i] != val){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }

            while(j < nums.length && nums[j] != val) j++;
        }

        return j;
    }
}