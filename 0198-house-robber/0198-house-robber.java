class Solution {
    public int rob(int[] nums) {
        int prev = 0;          //best till prev  if skip
        int prevprev = 0;     // best till prevprev if not skip
        for(int money: nums){
            int take = money + prevprev;
            int skip = prev;
            int curr = Math.max(take, skip);
            prevprev = prev;
            prev = curr;
        }

        return prev;
        
    }
}