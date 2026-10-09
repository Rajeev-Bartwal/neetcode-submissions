class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> mp = new HashMap();
        for(int i : nums){
            mp.put(i , mp.getOrDefault(i , 0) + 1);
        }

        for( int i: mp.keySet()){
            if(mp.get(i) > nums.length/2) return i;
        }

        return -1;
    }
}