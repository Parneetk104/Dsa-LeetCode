class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            arr[n + i] = nums[i];
        }
        return arr;
    }
}