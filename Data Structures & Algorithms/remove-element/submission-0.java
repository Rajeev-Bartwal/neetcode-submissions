class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){ 
                j = i;
                break;
            }    
        }

        for(int i = j;i<nums.length;i++){
            if(nums[i] != val){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }

            while(nums[j] != val) j++;
        }

        return kj;
    }
}