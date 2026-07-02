class Solution {
    public int maxArea(int[] heights) {
        
        int n=heights.length;
        int left=0;
        int right=n-1;

        int maxWaterContain=0;

        while(left<right){
             int height=Math.min(heights[left], heights[right]);

             int width=right-left;

             int waterContain=height*width;


            maxWaterContain=Math.max(waterContain,maxWaterContain);
            //  if(waterContain>maxWaterContain){
            //     maxWaterContain=waterContain;
                
            //     }
               if (heights[left] < heights[right]) {
    left++;
} else {
    right--;
}
               
           
        }
         return maxWaterContain;
    }
}
