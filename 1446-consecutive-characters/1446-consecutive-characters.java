class Solution {
    public int maxPower(String s) {
        int maxlen = 0;
        for(int i = 0; i < s.length(); i++){
            int count = 1;
            int j = i + 1;
            while(j < s.length() && s.charAt(i) == s.charAt(j)){
                j++;
                count++;
            }
            maxlen = Math.max(maxlen, count);
        }
        return maxlen;
        
    }
}