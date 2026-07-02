class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
              //Array initializer 
                int[] ans = {map.get(diff), i};
                return ans;
            }
            map.put(nums[i], i);
        }
        return null;

        // Set<Integer> set = new HashSet<>();
        // for(int i = 0; i < nums.length; i++){
        //     int diff = target - nums[i];
        //     if(!set.contains(diff)){
        //         set.add(nums[i]);
        //     }

        // }

        
        
    }
}