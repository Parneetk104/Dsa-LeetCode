class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        int i = 0;
        while(i < nums.length){
            if(set.contains(original)){
                original = original * 2;
            }
            i++;
        }
      
        return original;
    }
}