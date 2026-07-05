class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int n = s.length();
        int[] freq = new int[26];
        char maxCh = '\0';
        int maxfreq = 0;
        int maxlen = 0;
        for(int r = 0; r < n; r++){
            char ch = s.charAt(r);
            freq[ch - 'A']++;
            maxfreq = Math.max(maxfreq, freq[ch - 'A']);
            
           // int changes = ;
            if((r - l + 1) - maxfreq > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);

        }
        return maxlen;
    }
}