class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int low = 0, high = numbers.length - 1;
        int sum = 0;
       // int i = 0;
        while(low < high){

            sum = numbers[low] + numbers[high];
            if(sum == target) {
                return new int[]{low + 1, high + 1}; 
            }else if(sum > target){
                high--;
            }else {
                low++;
            }
        }
        return new int[]{};
        
    }
}