class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        } 
        for(int x: freq.keySet()){
            if(freq.get(x) == 2){
                list.add(x);
            }
        }
        return list;
        
    }
}