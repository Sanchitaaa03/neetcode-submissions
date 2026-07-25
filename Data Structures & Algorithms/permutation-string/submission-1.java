class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        char[] s1Arr = new char[26];
        
        
        for(int i=0;i<s1.length();i++){

            s1Arr[s1.charAt(i)-'a']++;
        }
        
        int k=s1.length();
        for(int i=0;i<s2.length();i++){

            int windowStart=0;
            int idx=i;
            char[] s2Arr=new char[26];

            while(windowStart<k && idx<s2.length()){
                s2Arr[s2.charAt(idx)-'a']++;
                windowStart++;
                idx++;  
            }

            if(Arrays.equals(s1Arr,s2Arr)){
                return true;
            }

        }
        return false;
    }
}
