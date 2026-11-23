class Solution {
    public int subarraySum(int[] nums, int k) {
        //preFixSUm + HashMap
        //Whenever a question asks you to count subarrays with a given sum and negative numbers are allowed, think of Prefix Sum + HashMap first.
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int currSum = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            int need = currSum - k;
            if(map.containsKey(need)){
                count += map.get(need);
            }
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
        return count;

    }
}