class Solution {
    //Bonary Srach only bcs we know the range
    private boolean capacityCheck(int[] weights, int days, int mid){
       int day = 1, load = 0;
       for(int wgt: weights){
         if(load + wgt  <= mid){
            load += wgt;
         }else {
            day++;
            load = wgt;
         }
       }
       return day <= days;


    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        int MaxCapacity = 0;
        for(int i = 0; i < weights.length; i++){
            low = Math.max(low, weights[i]);
            MaxCapacity += weights[i];
        }
        high = MaxCapacity;
        int ans = high;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(capacityCheck(weights, days, mid)){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }
}