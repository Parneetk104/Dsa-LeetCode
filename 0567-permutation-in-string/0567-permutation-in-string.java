class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int n = s2.length();
        int l = 0;
        int[] freq = new int[26];
        for(int i = 0; i < k; i++){
            freq[s1.charAt(i) - 'a']++;
        }
        int[] window = new int[26];
        for(int r = 0; r < n; r++){
            window[s2.charAt(r) - 'a']++;
            if((r - l + 1) > k){
                window[s2.charAt(l) - 'a']--;
                l++;
            }
            
            if((r - l + 1) == k){
                 if(Arrays.equals(window,freq)) return true;
            }
            
            //== compares references (memory addresses), not contents.
           
            
        }
        return false;
        
    }
}