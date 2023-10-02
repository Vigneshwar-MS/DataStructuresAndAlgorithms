class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length, col = matrix[0].length;
        
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == target) return true;
            }
        }
        return false;
    }
}

//Time Complexity is O(M * N), where M is number of rows and N is number of columns
//Space Complexity is O(1)
