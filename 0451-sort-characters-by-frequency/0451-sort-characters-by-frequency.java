class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

      // The queue should compare characters based on their frequency stored in the map.
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for(char ch: map.keySet()){
            pq.add(ch);
        }
        while(!pq.isEmpty()){
            char ch = pq.remove();
            int count = map.get(ch);
            while(count > 0){
                sb.append(ch);
                count--;
            }
        }
        return sb.toString();

        
        
        
    }
}