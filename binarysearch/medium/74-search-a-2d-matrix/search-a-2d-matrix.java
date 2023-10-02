class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = 0, col = matrix[0].length - 1;
        
        //Time complexity is O(M) as we check in each row whether the target is inside the boundary 
        // of that row
        while(row < matrix.length && matrix[row][col] < target) row++;
        
        if(row == matrix.length) return false;
        
        //Time complexity is O(logN)
        int left = 0, right = col;
        while(left <= right){
            int mid = (left + right) / 2;
            if(matrix[row][mid] == target) return true;
            else if(matrix[row][mid] < target) left = mid + 1;
            else{
                right = mid - 1;
            }
        }
        return false;
    }
}

//Time Complexity is O(M * logN), where M is number of rows and N is number of columns
//Space Complexity is O(1)