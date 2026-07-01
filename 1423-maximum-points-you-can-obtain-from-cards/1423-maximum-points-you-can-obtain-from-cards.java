class Solution {
    public int maxScore(int[] cardPoints, int k) {
         int n = cardPoints.length;
        int maxSum = 0;
        int lsum = 0, rsum = 0;
        for(int i = 0; i <= k - 1; i++){
            lsum += cardPoints[i];
            maxSum = lsum;
        }
       
        int rIdx = n - 1;
        for(int i = k - 1; i >= 0; i--){
            lsum = lsum - cardPoints[i];
            rsum += cardPoints[rIdx];
            rIdx--;
             maxSum = Math.max(maxSum, lsum + rsum);

        }
        return maxSum;


       
        
    }
}

/*
int sum = 0;
        for(int i = l; i <= r; i++){
            sum += cardPoints[i];
        }
        int maxSum = sum;
        while(r < n - 1){
            sum -= cardPoints[l];
            l++;
            r++;
            sum += cardPoints[r];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
*/