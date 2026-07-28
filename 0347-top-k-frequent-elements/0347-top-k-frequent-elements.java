class Pair implements Comparable<Pair>{
    int ele;
    int freq;
    Pair(int ele, int freq){
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(Pair other){
        if(this.freq == other.freq) return this.ele - other.ele;
        return this.freq - other.freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int val: nums){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        for(int ele: map.keySet()){
            pq.add(new Pair(ele, map.get(ele)));

            if(pq.size() > k){
                pq.remove();
            }
        }
        while(pq.size() > 0){
            Pair top = pq.remove();
            ans.add(top.ele);
        }
        Collections.reverse(ans);
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}