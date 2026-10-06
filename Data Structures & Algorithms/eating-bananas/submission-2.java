class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 , high = piles[0] , ans = 0;

        for(int i: piles){
            high = Math.max(high , i);
        }
        
        while(low <= high){
            int mid = low + (high-low)/2;

            if(canEat(piles , mid, h)){
               ans = mid;
               high = mid-1;
            }else{
               low = mid+1;
            }
        }

        return ans;

    }

    boolean canEat(int[] arr , int n , int h){
        int count = 0;

        for(int i:arr){
            count += (i + (long)n - 1) / n;
        }

        return count <= h;
    }
}
