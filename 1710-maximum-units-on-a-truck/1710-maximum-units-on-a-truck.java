class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int n = boxTypes.length;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int maxUnits = 0;
        for(int box []: boxTypes){
            int NBoxes = box[0];
            int unitsPer = box[1];
            int toTakeBoxes  = Math.min(NBoxes, truckSize);
            maxUnits += toTakeBoxes * unitsPer;
            truckSize = truckSize - toTakeBoxes;
            if(truckSize == 0) break;
           
            
        }
         return  maxUnits;
    }
}