class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int prefSum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < n; i++){
            prefSum += nums[i]; 
            int need = prefSum - goal;
            if(map.containsKey(need)){
                count += map.get(need);
            }
            map.put(prefSum, map.getOrDefault(prefSum, 0) + 1);
        }
        return count;
    }
}