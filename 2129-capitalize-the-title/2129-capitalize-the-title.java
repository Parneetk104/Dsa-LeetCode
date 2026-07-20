class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i <= title.length(); i++){
            //end of word / space
           
            if(i == title.length() || title.charAt(i) == ' '){
                if(sb.length() > 0){
                    if(sb.length() <= 2){
                        for(int j = 0; j < sb.length(); j++){
                            ans.append(Character.toLowerCase(sb.charAt(j)));
                        }
                    }else {
                        ans.append(Character.toUpperCase(sb.charAt(0)));
                        for(int j = 1; j < sb.length(); j++){
                            ans.append(Character.toLowerCase(sb.charAt(j)));
                        }
                    }
                    sb.setLength(0);
                }
                if(i != title.length()){
                    ans.append(' ');
                }
            }else {
                sb.append(title.charAt(i));
            }
        }
        return  ans.toString();
    }
        
}






/*
for(int i = 0; i < title.length(); i++){
            char ch = title.charAt(i);
            if(ch != ' '){

                if(capital){
                    if(Character.isLowerCase(ch)){
                        ch = Character.toUpperCase(ch);
                        sb.append(ch);
                        capital = false;
                    }else {
                        sb.append(ch);
                        capital = false;
                    } 
                }else {
                    ch = Character.toLowerCase(ch);
                    sb.append(ch);
                }  
            }
            ans.append(sb);
            sb.setLength(0);
            if(ch == ' '){
                ans.append(' ');
                ans.append(sb);
                capital = true;
            }
        }
        if(sb.length() > 0){
            ans.append(sb);
        }
        
        return ans.toString(); */