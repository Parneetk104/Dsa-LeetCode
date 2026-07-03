class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 0;
        int maxlen = 0;
        for(r = 0; r < fruits.length; r++){
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            while(map.size() > 2){
                int count = map.get(fruits[l]);
                if(count <= 1){
                    map.remove(fruits[l]);
                    l++;
                }else {
                    map.put(fruits[l], count - 1);
                    l++;
                }
                
            }
           
                maxlen = Math.max(maxlen, r - l + 1);
            
            

        }
        return maxlen;
        
    }
}