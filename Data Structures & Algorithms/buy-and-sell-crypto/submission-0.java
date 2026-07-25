class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit=Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++){

            for(int j=i+1; j<prices.length;j++){

                int profit=prices[j]-prices[i];
               
                maxProfit=Math.max(maxProfit,profit);
                
            }
        }
        return (maxProfit<0 ? 0 : maxProfit);
    }
}
