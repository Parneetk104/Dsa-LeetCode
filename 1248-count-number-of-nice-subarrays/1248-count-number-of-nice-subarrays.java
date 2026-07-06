class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int n = nums.length;
        int count = 0;
        int prefixSum = 0;
        int oddprefixSum = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 1){
                oddprefixSum++;
            }else {
                oddprefixSum+=0;
            }
            if(map.containsKey(oddprefixSum - k)){
                count += map.get(oddprefixSum - k);
            }
            map.put(oddprefixSum, map.getOrDefault(oddprefixSum, 0) + 1);
           
        }
        return count;

    }
}