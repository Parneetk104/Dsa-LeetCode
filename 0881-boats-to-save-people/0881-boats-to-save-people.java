class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int i = 0, j = n - 1;
        int boats = 0;
        while(i <= j){
            if(people[i] + people[j] <= limit){
                boats++;
                i++;
                j--;
                //if togrther not working, send th3 heiveist person first
            }else if(people[j] <= limit){
                boats++;
                j--;
            }
        }
        return boats;
    }
}