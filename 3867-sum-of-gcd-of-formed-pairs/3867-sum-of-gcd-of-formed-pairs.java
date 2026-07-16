class Solution {
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a  = temp;
        }
        return a;
        
    }
    public long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        prefixGcd[0] = nums[0];
        for(int i= 1; i < nums.length; i++){
            prefixGcd[i] = Math.max(prefixGcd[i - 1], nums[i]);
        }
        for(int i= 1; i < nums.length; i++){
            prefixGcd[i] = gcd(nums[i], prefixGcd[i]);
        }
        Arrays.sort(prefixGcd);
        int i = 0, j = prefixGcd.length - 1;
        long sum = 0;
        while(i < j){
            int n = gcd(prefixGcd[i], prefixGcd[j]);
            sum += n;
            i++;
            j--;
        }
        return sum;

    }
}