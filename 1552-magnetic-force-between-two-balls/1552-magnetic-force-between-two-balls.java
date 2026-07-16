class Solution {
    boolean canDistribute(int[] position, int m, int mid){
        int balls = 1;
        int lastpos = position[0];
        for(int i = 0; i < position.length; i++){
            if(position[i] - lastpos >= mid){
                balls++;
                lastpos = position[i];
            }
        }
        return balls >= m;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 0, high = position[position.length - 1] - position[0];
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canDistribute(position, m, mid)){
                ans = mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return ans;
    }
}