class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        int maxlen = 0;
        for(int id: set){
            if(!set.contains(id - 1)){
                int curr = id;
                int len = 1;
                while(set.contains(curr + 1)){
                    len++;
                    curr++;
                }
                maxlen = Math.max(maxlen, len);
            }
        }
        return maxlen;

    }
}