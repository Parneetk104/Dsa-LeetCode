class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        StringBuilder ans = new StringBuilder();
        String[] word = title.split(" ");
        for(int i = 0; i < word.length; i++){
            if(word[i].length() <= 2){
                ans.append(word[i]);
            }else {
                ans.append(Character.toUpperCase(word[i].charAt(0)));
                ans.append(word[i].substring(1));
            }
            if(i != word.length - 1){
                ans.append(' ');
            }

        }
        return ans.toString();

        
    }
}