class Solution {
    //the subarray between those prefix sums has a sum that is a multiple of k
    //Same remainder → subarray sum is divisible by k
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];
    
            int rem = prefixSum % k;
            if(map.containsKey(rem)){
                    int prevI = map.get(rem);
                    if(i - prevI >= 2){
                        return true;
                    } 
            }else {
                map.put(rem, i);
            }
        }
        return false;
        
        
    }
}