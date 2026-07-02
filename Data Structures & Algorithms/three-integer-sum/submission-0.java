class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> ansList= new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<n;i++){

          if(i>0 && nums[i]==nums[i-1]){
            continue;
          }

          int j=i+1;
          int k=n-1;

          while(j<k){

            if(nums[i]+nums[k]+nums[j]>0){
                k--;
            }
            else if(nums[i]+nums[k]+nums[j]<0){
              j++;

            }else{
                 List<Integer> tempList=Arrays.asList(nums[i],nums[k],nums[j]);
                 ansList.add(tempList);
                 j++;
                 k--;

                 while(j<k && nums[j]==nums[j-1]){
                  j++;
                 }

                 while(j<k && nums[k]==nums[k+1]){
                  k--;
                 }
            }
          }
        }
      return ansList;
    }
}
