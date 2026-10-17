class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        int temp = n;
        while(temp > 0){
            int dig = temp % 10;
            sum += dig;
            prod *= dig;
            temp = temp / 10;
        }
        int diff = prod - sum;
        return diff;
    }
}