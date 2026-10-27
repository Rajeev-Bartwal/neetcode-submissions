class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> ans  = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int num1 = nums[i];

            for(int j=i+1;j<nums.length;j++){
                int num2 = nums[j];
                HashMap<Integer , Integer> mp = new HashMap<>();

                for(int k = j+1;k<nums.length;k++){
                    long rem = (long) target - nums[k] - num2 - num1;

                    if (rem >= Integer.MIN_VALUE &&
                        rem <= Integer.MAX_VALUE &&
                        mp.containsKey((int) rem)) {
                        List<Integer> temp = Arrays.asList(num1, num2, nums[k], (int) rem);

                        Collections.sort(temp);

                        ans.add(temp);
                    }

                    mp.put(nums[k] , k);
                }
                
            }
        }

        return new ArrayList<>(ans);
    }
}