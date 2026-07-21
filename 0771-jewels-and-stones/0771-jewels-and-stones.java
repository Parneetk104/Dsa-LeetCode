class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        //int[] freq = new int[26];
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < jewels.length(); i++){
            set.add(jewels.charAt(i));
        }
        for(char ch: stones.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }
}