class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int el1 = -1 , el2 = -1;
        int c1 = 0 , i = 0, c2 = 0;
       

        while(i < nums.length){

            if(nums[i] == el1 && c1 > 0) c1++;
            else if(nums[i] == el2 && c2 > 0) c2++;
            else if(c1 == 0){ el1 = nums[i];
            c1++;
            }
            else if(c2 == 0){ 
                el2 = nums[i];
                c2++;
            }
            else{
                c1--;
                c2--;
            }
            i++;
        }

        c1 = 0 ;
        c2 = 0;
        for(i=0;i<nums.length;i++){
            if(nums[i] == el1) c1++;
            else if(nums[i] == el2) c2++;
        }

        if(c1 > nums.length/3) ans.add(el1);
        if(c2 > nums.length/3) ans.add(el2);

        return ans;
    }
}