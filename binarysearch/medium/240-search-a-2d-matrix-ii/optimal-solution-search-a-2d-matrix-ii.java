class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length, col = matrix[0].length;
    
        for(int i = 0; i < row; i++){
            int left = 0, right = col - 1;
            while(left <= right){
                int mid = (left + right) / 2;
                if(matrix[i][mid] == target) return true;
                else if(matrix[i][mid] < target) left = mid + 1;
                else{
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}

//Time Complexity is O(M * logN), where M is number of rows and N is number of columns
//Space Complexity is O(1)
