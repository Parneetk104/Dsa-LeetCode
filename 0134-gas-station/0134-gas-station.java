class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int startIdx = 0;
        int totalfuel = 0;
        int totalGas = 0, totalCost = 0;
        for(int g: gas) totalGas += g;
        for(int c: cost)  totalCost += c;
        
        if(totalCost > totalGas) return -1;
        for(int i = 0; i < gas.length; i++){
            totalfuel += gas[i] - cost[i];
            if(totalfuel < 0) {
                startIdx = i + 1;
                totalfuel = 0;
            }
            
        }
        
        return startIdx;
    }
}