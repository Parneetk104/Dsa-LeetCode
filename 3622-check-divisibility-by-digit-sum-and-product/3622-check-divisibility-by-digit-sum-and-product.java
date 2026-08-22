class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int prod = 1;
        while(temp > 0){
            int digit = temp % 10;
            sum += digit;
            prod *= digit;
            temp = temp / 10;
        }
        //if(prod == 0) return true;
        int tSum = sum + prod;
        if(n % tSum == 0){
            return true;
        }
        return false;

    }
}