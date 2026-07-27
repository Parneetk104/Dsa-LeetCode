class Solution {
    public boolean Isomorphic(String s, String pattern){
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = pattern.charAt(i);
            if(map.containsKey(ch1)){
                if(map.get(ch1) != ch2){
                    return false;
                }
            }else {
                if(set.contains(ch2)){
                    return false;
                }
                map.put(ch1, ch2);
                set.add(ch2);
            }
        }
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if(Isomorphic(word, pattern)){
                list.add(word);
            }
        }
        return list;
    }
}