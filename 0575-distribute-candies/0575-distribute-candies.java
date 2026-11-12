class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = candyType.length;
        for(int i = 0; i < candyType.length; i++){
            map.put(candyType[i], map.getOrDefault(candyType[i], 0) + 1);
        }
        int canEat = n / 2;
        if(map.size() > canEat){
            return canEat;
        }
        return map.size();

    }
}