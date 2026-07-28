class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character, Integer> map =new HashMap<>();

        int low=0;
        int maxFreq=0;

        int maxStore=0;

        for(int high=0;high<s.length();high++){

            map.put(s.charAt(high), map.getOrDefault(s.charAt(high),0)+1);

            for (int count : map.values()) {
                maxFreq = Math.max(maxFreq, count);
            }

            int replacementNedded= high-low+1 - maxFreq;


            while(replacementNedded>k){

                map.put(s.charAt(low), map.get(s.charAt(low))-1);

                low++;

                maxFreq = 0;
                for (int count : map.values()) {
                    maxFreq = Math.max(maxFreq, count);
                }

                replacementNedded= high-low+1 - maxFreq;
            }
            maxStore=Math.max(maxStore,high-low+1);

        }

        return maxStore;
    }
}