class Solution {
    public int trap(int[] height) {
        
        int n=height.length;

        int left=0;

        int right=n-1;
        
        int rightMax=height[n-1];

        int leftMax=height[0];

        int totalWater=0;

        while(left<right){

            if(leftMax<rightMax){
                left++;

                if(leftMax<height[left]){
                    leftMax=height[left];
                }else{
                    totalWater+=(leftMax-height[left]);
                }
            
            }else{
               right--;

               if(height[right]>rightMax){
                rightMax=height[right];
               
               }else{

                totalWater+=(rightMax-height[right]);
               }
            }
        }

        return totalWater;
    }
}
