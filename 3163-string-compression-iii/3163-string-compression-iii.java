class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
            char curr = word.charAt(i);
            int j = i + 1;
            int count = 1;
            while(j < word.length() && curr == word.charAt(j)){
                count++;
                j++;
            }
            if(count > 9){
                for(int k = 0; k < count/9; k++){
                    sb.append(9);
                    sb.append(curr);
                }
                if(count%9 != 0){
                    sb.append(count%9);
                    sb.append(curr);
                }
                
            }else {
                sb.append(count);
                sb.append(curr);
            }
            
            
            i = j - 1;
        }
        return sb.toString();

        
    }
}
/*
sb.append(9);
                sb.append(curr);
                count = count - 9;
                sb.append(count);*/