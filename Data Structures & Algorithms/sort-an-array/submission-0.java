class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums , 0 , nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums, int low, int high){

        if(low >= high) return;

        int mid = low+(high-low)/2;

        mergeSort(nums , low , mid);
        mergeSort(nums , mid+1, high);
        merge(nums, low , mid , high);

    }

    public void merge(int[] nums,int low,int mid,int high){

        int i = low;
        int j = mid+1;

        int[] ans = new int[high-low+1];
        int k = 0;

        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                ans[k++] = nums[i++];
            } else {
                ans[k++] = nums[j++];
            }
        }


        while (i <= mid) {
            ans[k++] = nums[i++];
        }


        while (j <= high) {
            ans[k++] = nums[j++];
        }

        for (int x = 0; x < ans.length; x++) {
            nums[low + x] = ans[x];
        }
    }
}