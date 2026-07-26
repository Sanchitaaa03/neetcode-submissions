class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int low=0;
        int high=0;
        int mxLen=0;
        Set<Character> set= new HashSet<>();


        while(high<s.length()){

            while(set.contains(s.charAt(high))){
                set.remove(s.charAt(low));
                low++;
            }

            set.add(s.charAt(high));

            mxLen=Math.max(mxLen,high-low+1);
            high++;
        }

        return mxLen;
        
    }
}
