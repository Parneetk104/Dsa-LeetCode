class Solution {
    public int findLongestChain(int[][] pairs) {
        if(pairs.length == 1) return 1;
        int maxlen = 0;
        int len = 1;
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int lastfinish = pairs[0][1];
        for(int i = 1; i < pairs.length; i++){
            if(pairs[i][0] > lastfinish){
                len++;
               
                lastfinish = pairs[i][1];
            }
             maxlen = Math.max(maxlen, len);
            
            
        }
        return maxlen;
    }
}