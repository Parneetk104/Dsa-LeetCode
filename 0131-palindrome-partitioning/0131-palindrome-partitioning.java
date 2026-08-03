class Solution {
    public boolean isPalindrome(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;

        }
        return true;
    }
    private void backtrack(String s, int start, List<List<String>> ans,  List<String> curr){
        if(start == s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        //loop true every possiblr substirng
        for(int end = start; end < s.length(); end++){
            if(isPalindrome(s, start, end)){
                String part = s.substring(start, end + 1);
                curr.add(part);
                backtrack(s, end + 1, ans, curr);
                curr.remove(curr.size() - 1);
            }
        }


    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        backtrack(s, 0, ans, curr);
        return ans;
    }
}