class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int zcnt = 0;
        for(int n: arr){
            set.add(n);
            if(n == 0){
                zcnt++;
            }
        }
        if(zcnt >=2) return true;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) continue;
            int prod = 2 * arr[i];
            if(set.contains(prod)){
                return true;
            }
        }
        return false;
    }
}