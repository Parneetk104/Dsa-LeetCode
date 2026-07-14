class Solution {
    private boolean possible(int[] bloomDay, int day, int m, int k){
        int count = 0;
        int numB = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= day){
                count++;
            }else {
                numB += (count/k);
                count = 0;
            }
        }
        numB += (count/k);
        return numB >= m; 


    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for(int bl: bloomDay){
            high = Math.max(high, bl);
            low = Math.min(low, bl);
        }
        if((long)m * k > bloomDay.length) return -1;
        int ans = high;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(possible(bloomDay, mid, m, k)){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
        
    }
}