class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int count = 0;
        int len = 1;
        int n = colors.length;
        for(int i = 1; i < n + k - 1; i++){
        
            if(colors[i % n] != colors[(i - 1) % n]){
                len += 1; 
            }else {
               
                len = 1;
            }
            if(len >= k){
                count++;
            }
        }
        return count;
    }
}