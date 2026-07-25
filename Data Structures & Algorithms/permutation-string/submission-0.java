class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
       char[] s1arr= s1.toCharArray();

       Arrays.sort(s1arr);

       String sorts1= new String(s1arr);

       System.out.println(sorts1);

      

       int i=0;
       int j=s1.length()-1;

        while(j<s2.length()){

           
         String newString= s2.substring(i,j+1);

         char[] newStringArr=newString.toCharArray();

         Arrays.sort(newStringArr);

         String sortednewString=new String(newStringArr);
                   System.out.println(sortednewString);

           
            if(sorts1.equals(sortednewString)){
                return true;
            }
             i++;
            j++;
        }
        return false;
       
    }
}
