class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            char  ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for(int j = 0; j < t.length(); j++){
            char c = t.charAt(j);
            freq[c - 'a']--;
        }
        for(int k = 0; k < 26; k++){
            if(freq[k] != 0) return false;
        }
        return true;
    }
}


/*
"The input contains only lowercase English letters, so I can use a fixed-size array of length 26. This gives constant extra space, avoids hashing overhead, and is faster than a HashMap while keeping the same overall time complexity of O(n)."
 HashMap<Character, Integer> freq = new HashMap<>();

        if(s.length() != t.length()) return false;
        for(char ch: s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for(char ch: t.toCharArray()){
            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch) - 1);
                if(freq.get(ch) == 0) freq.remove(ch);
                
            }else{
                return false;
            }
        }

        return freq.isEmpty(); 
 */