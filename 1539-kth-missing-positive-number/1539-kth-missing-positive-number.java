class Solution {
    //Binary Search on Answer / Missing Count Pattern
    //How many numbers are missing before arr[i]?
    //missing before arr[i] = arr[i] - (i + 1)
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int miss = arr[mid] - (mid + 1);
            if(miss >= k){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return low + k;
        
    }
}