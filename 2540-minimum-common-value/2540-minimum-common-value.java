class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                min = Math.min(min, nums1[i]);
                return nums1[i];
            }else if(nums1[i] < nums2[j]) {
                i++;
            }else {
                j++;
            }
        }
        return -1;
        
    }
}