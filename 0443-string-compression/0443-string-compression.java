class Solution {
    public int compress(char[] chars) {
        int write = 0;
        //for overWriting the res
        for(int i = 0; i < chars.length; i++){
            int j = i + 1;
            char curr = chars[i];
            int count = 1;
            while(j < chars.length && chars[j] == curr){
                count++;
                j++;
            }
            chars[write++] = curr;
            if(count > 1){
                String s = String.valueOf(count);
                for(char c: s.toCharArray()){
                    chars[write] = c;
                    write++;
                }
            } 
            i = j - 1;
        }
        return write;
        
    }
}