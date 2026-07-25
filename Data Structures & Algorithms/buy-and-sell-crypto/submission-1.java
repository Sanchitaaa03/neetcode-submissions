class Solution {
    public int maxProfit(int[] prices) {
        
        int low=0;
        int high=1;

        int mxProfit=0;

        while(high<prices.length){

            if(prices[low]<prices[high]){

                 int profit=prices[high]-prices[low];
                 mxProfit=Math.max(mxProfit,profit);
            }else 
                low=high;

                high++;
        }


        return mxProfit;
    }
}
