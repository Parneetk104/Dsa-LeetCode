class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int left = 0;
        int maxlen = 0;
        for(int r = 0; r < s.length(); r++){
            char ch = s.charAt(r);
            freq[ch - 'a']++;

            while(freq[ch - 'a'] > 2){
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            maxlen = Math.max(maxlen, r - left + 1);
        }
        return maxlen;
    }
}