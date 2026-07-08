class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();
        for(int x: nums1){
            set1.add(x);
        }
        for(int val: nums2){
            if(set1.contains(val)){
                intersect.add(val);
            }
        }
        int[] ans = new int[intersect.size()];
        int k = 0;
        for(int val: intersect){
            ans[k] = val;
            k++;
        }
        return ans;
    }
}