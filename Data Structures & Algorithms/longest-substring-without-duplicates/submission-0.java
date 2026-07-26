class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int low=0;
        int high=0;

        int mxLen=0;
        while(high<s.length()){

                String str="";
            while(high<s.length() && !str.contains(String.valueOf(s.charAt(high)+""))){
                str+=s.charAt(high);
                mxLen=Math.max(high-low+1,mxLen);

                if(high==s.length())
                break;
                high++;
            }
            str="";
            low++;
            high=low;
        }
        return mxLen;
    }

}
