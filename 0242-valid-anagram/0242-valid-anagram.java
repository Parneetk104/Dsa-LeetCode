class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for(char ch: s.toCharArray()){
            freq[ch - 'a']++;
        }
         for(char ch: t.toCharArray()){
            freq[ch - 'a']--;
        }
        for(int f: freq){
            if(f != 0) return false;
        }
        return true;
    }
}


/*
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