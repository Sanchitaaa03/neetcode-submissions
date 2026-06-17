class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for (int i=0;i<nums.length;i++) {
           int diff=target-nums[i];

           if(map.containsKey(diff) && map.get(diff)!=i){

            int j=map.get(diff);
            return new int[]{i,j};
           }

           

}

    return new int[]{-1,-1};   
    }
}
