class Solution {
    //Run Length Encoding (RLE)
    public String countAndSay(int n) {
       
        String ans = "1";
        for(int i = 1; i < n; i++){
            StringBuilder sb = new StringBuilder();
            int j = 0;
            while(j < ans.length()){
                char curr = ans.charAt(j);
                int count = 0;
                while(j < ans.length() && curr == ans.charAt(j)){
                    count++;
                    j++;
                }
                sb.append(count);
                sb.append(curr);
            }
            ans = sb.toString();
           
        }
        return ans;

    }
}