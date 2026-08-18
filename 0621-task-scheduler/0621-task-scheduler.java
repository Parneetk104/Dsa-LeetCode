class Solution {
    public int leastInterval(char[] tasks, int n) {
        //The goal is to arrange tasks to minimize the total time, including idle time.
        //The minimum number of time units needed to execute all tasks while respecting the cooldown.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] freq = new int[26];
        for(char ch: tasks){
            freq[ch - 'A']++;
        }
        int time = 0;
        for(int x: freq){
            if(x > 0){
                pq.add(x);
            }
           
        }
       
            
        while(!pq.isEmpty()){
            int cycle = n + 1;
            int used = 0;
            // Store remaining frequencies temporarily
            List<Integer> temp = new ArrayList<>();
            while(!pq.isEmpty() && cycle > 0){
                int fr = pq.remove();
                fr--;
                if(fr > 0){
                   temp.add(fr);
                }
                used++;
                cycle--;
             
            }
            // Put tasks back AFTER the cycle
            for (int fr : temp) {
                pq.add(fr);
            }
            if(!pq.isEmpty()){
                time += n + 1;
            }else {
                time += used;
            }
        }

        return time;
    }
}