class Solution {
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        int left = 0;
        int right = word.indexOf(ch);
        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}