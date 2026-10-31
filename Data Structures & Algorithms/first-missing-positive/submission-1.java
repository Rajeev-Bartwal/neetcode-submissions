class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] > 0 &&
                nums[i] <= nums.length &&
                nums[i] != nums[nums[i] - 1]) {

                int ci = nums[i] - 1;

                int temp = nums[ci];
                nums[ci] = nums[i];
                nums[i] = temp;

            }else {
               i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                return j + 1;
            }
        }

        return nums.length + 1;
    }
}