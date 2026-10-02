class Solution {
    public String greatestLetter(String s) {
        char great = '\0';
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
            }
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            char low = Character.toLowerCase(ch);
            char upper = Character.toUpperCase(ch);
            if(set.contains(low) && set.contains(upper)){
                if(upper > great) great = upper;
                
            }
        }
        return great == '\0' ? "" : String.valueOf(great);


    }
}