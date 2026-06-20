class Solution {
    String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public void Combinations(String digits, int index, String curr, List<String> ans){
        if(index == digits.length()){
            ans.add(curr);
            return;
        } 
        String letters = map[digits.charAt(index) - '0'];
        for(char ch: letters.toCharArray()){
            Combinations(digits, index + 1, curr + ch, ans);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String>ans = new ArrayList<>();
        Combinations(digits, 0, "", ans);
        return ans;
        
    }
}