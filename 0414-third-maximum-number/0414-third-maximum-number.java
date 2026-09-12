class Solution {
    public int thirdMax(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int x: nums){
            if(!set.contains(x)){
                set.add(x);
                list.add(x);
            } 
        }
        Collections.sort(list);
        if(list.size() < 3) return Collections.max(list);
        int max_3 = list.get(list.size() - 3);
        return max_3;
    }
}