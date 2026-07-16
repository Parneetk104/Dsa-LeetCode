class Solution {
    public boolean allocate(int[] candies, long k, int mid){
        long ch = 0;
        int totalpiles = 0;
        //Each child must receive candies from exactly one pile.
        for(int i = 0; i < candies.length; i++){
            ch += candies[i] / mid;
            
        }
        return ch >= k;
    }
    public int maximumCandies(int[] candies, long k) {
        //search ranges find --------------------->>>>>>>>>>>>>>>>>>
        int low = 1, high = 0;
        for(int i = 0; i < candies.length; i++){
            high = Math.max(high, candies[i]);
        }
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(allocate(candies, k, mid)){
                ans = mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }


        return ans;
    }
}