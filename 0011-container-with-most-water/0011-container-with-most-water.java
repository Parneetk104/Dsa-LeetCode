class Solution {
    //find two lines that form a container holding the maximum water.
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxArea = 0;
        int Area = 1;
        while(l < r){
            Area = (r - l) * Math.min(height[l], height[r]);
            maxArea = Math.max(maxArea, Area);
            if(height[l] < height[r]){
                l++;
            }else {
                r--;
            }
            
        }
        return maxArea;
        
    }
}