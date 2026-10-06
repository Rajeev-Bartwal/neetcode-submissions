class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i:nums){
            mp.put(i , mp.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2) -> (mp.get(n1) - mp.get(n2)));

        for(int i: mp.keySet()){
            pq.add(i);

            if(pq.size() > k){
                pq.poll();
            }
        }
        
        int[] ans = pq.stream().mapToInt(Integer::intValue).toArray();
        
        return ans;
    }
}
