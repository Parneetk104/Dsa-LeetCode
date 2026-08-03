class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i = 1; i <= n / 2; i++){
            
            StringBuilder sb = new StringBuilder();
            if(n % i == 0) {
                String part = s.substring(0, i);
                while(sb.length() < s.length()){
                    sb.append(part);
                }
                if(s.equals(sb.toString())){
                    return true;
                }
            }
        }
        return false;
    }
}