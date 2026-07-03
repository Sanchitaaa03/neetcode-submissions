class Solution {
    public int majorityElement(int[] nums) {

        int maxele=0;
        int key=-1;
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int max =map.get(nums[i]);
                if(max>nums.length/2){
                    if(max>maxele){
                   maxele=Math.max(max,maxele);
                   key=nums[i];
                    }
                }
            }
        }

        return key;
}
}