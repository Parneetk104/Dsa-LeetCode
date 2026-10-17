class Solution {
    public boolean digitCount(String num) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < num.length(); i++){
            char ch = num.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int cnt = 0;
        for(int i = 0; i < num.length(); i++){
            char dig = (char)(i + '0');
            int expect = num.charAt(i) - '0';
            int freq = map.getOrDefault(dig, 0);
            if(expect != freq){
                return false;
            }
        }
        return true;
        
    }
}