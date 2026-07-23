class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) return false;
        for(int i = 0; i < pattern.length(); i++){
            char ch1 = pattern.charAt(i);
            String word = arr[i];

            if(map.containsKey(ch1)){
                if(!map.get(ch1).equals(word)){
                    return false;
                }

            }else {
                if(set.contains(word)){
                    return false;
                }
                map.put(ch1, word);
                set.add(word);
            }
            
        }
        return true;
        
    }
}