class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums2.length; i++){
            while(!st.isEmpty() && st.peek() < nums2[i]){
                map.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }
            while(!st.isEmpty()){
                map.put(st.pop(), -1);
            }
        
        for(int i = 0; i < n; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;

    }
}