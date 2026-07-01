class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxlen = 0;
        for(int x: nums){
            set.add(x);
        }
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