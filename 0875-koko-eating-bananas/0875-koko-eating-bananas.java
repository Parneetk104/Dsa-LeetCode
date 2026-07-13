class Solution {
    private Boolean canFinish(int[] piles, int h, int speed){
        int totalHours = 0;
        for(int pile: piles){
            totalHours += (Math.ceil((double)pile / speed));
        }
        if(totalHours <= h){
            return true;
        }else {
            return false;
        }

    }
    public int minEatingSpeed(int[] piles, int h) {
        // //min speed = 1, max = max(piles)/h
        int low = 1, high = 0;
       
        for(int i = 0; i < piles.length; i++){
            high = Math.max(high, piles[i]);
        }
       
        int ans = Integer.MAX_VALUE;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canFinish(piles, h, mid)){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
            
        }
        return ans;
       

    }
}

/*
Once a speed becomes valid, every larger speed is also valid.
This is called a monotonic property.
as after k = 4, 5, 6, everything is vallid"
*/