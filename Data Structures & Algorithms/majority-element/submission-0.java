class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> mp = new HashMap();
        for(int i : nums){
            mp.put(i , mp.getOrDefault(i , 0) + 1);
        }

        Collection.sort(mp , (a,b) -> {mp.get(a) - mp.get(b)});

        if(mp.get(mp.size()-1) > nums.length/2) return mp.get(mp.size()-1);
    }
}