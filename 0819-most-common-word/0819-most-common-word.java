class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");
        String[] words = paragraph.split("\\s+");
        HashSet<String> set = new HashSet<>();
        for(String st: banned){
            set.add(st);
        }
        HashMap<String, Integer> freq = new HashMap<>();
        for(String str: words){
            freq.put(str, freq.getOrDefault(str, 0) + 1);
        } 
        
        String most = "";
        int maxFreq = 0;
        for(String str: freq.keySet()){
            if(!set.contains(str) && freq.get(str) >  maxFreq){
                maxFreq = freq.get(str);
                most = str;
            }
        }
        return most;

    }
}