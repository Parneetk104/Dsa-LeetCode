class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        //StringBuilder ans = new StringBuilder();
        
        int count = 0;
        while(sb.length() < b.length()){
            sb.append(a);
            count++;
        }
        if(sb.toString().contains(b)){
            return count;
        }else {
            sb.append(a);
            count++;
        }
        if(sb.toString().contains(b)){
            return count;
        }
        return -1;
        

        
        
    }
}