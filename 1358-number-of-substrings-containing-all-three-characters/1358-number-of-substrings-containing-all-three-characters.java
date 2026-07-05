class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int l = 0;
        int count= 0;
        int[] freq = new int[3];
        for(int r = 0; r < s.length(); r++){
            char ch = s.charAt(r);
            freq[ch - 'a']++;
            while(freq[0] >= 1 && freq[1] >= 1 && freq[2] >= 1){
                count += (n - r);
                freq[s.charAt(l++) - 'a']--;
                
            }
        }
        return count;
        
        

    }
}



/*
Map<Character, Integer> map = new HashMap<>();
        for(int r = 0; r <  n; r++){
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            // Shrink while window contains all 3 characters
            while(map.size() == 3){
                 // Every substring starting from l and ending at r,
                 count += (n - r);
                 char leftch = s.charAt(l);

                 map.put(leftch, map.get(leftch) - 1);
                 if(map.get(leftch) == 0) map.remove(leftch);
                 l++;
               
            }
        }
        return count*/