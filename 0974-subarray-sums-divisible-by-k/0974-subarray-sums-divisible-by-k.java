class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum = 0;
        //always add freq of (find) to the count
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];
            int rem = prefixSum % k;
            if(rem < 0) rem += k;
            if(map.containsKey(rem)){
                int c = map.getOrDefault(rem, 0);
                count += c;
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}