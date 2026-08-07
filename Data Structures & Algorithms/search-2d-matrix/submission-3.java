class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int i=0;
        
        for(i=0;i<matrix.length;i++){
            int j=matrix[i].length-1;

            if(matrix[i][j]>=target){
                break;
            }
        }

        if(matrix.length==i){
            return false;
        }
        

        int low=0;
        int high=matrix[i].length-1;

        while(low<=high){
            int mid= (low+high)/2;

            if(matrix[i][mid]==target){
                return true;
            }
            else if(matrix[i][mid]<target){
                low=low+1;
            }else
            {
                high=high-1;
            }
        }
        return false;
    }
}
