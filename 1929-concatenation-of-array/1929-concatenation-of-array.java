class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            arr.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            arr.add(nums[i]);
        }
        int[] ans = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            ans[i] = arr.get(i);
        }
        
        return ans;

    }
}