class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int rowTop = 0, rowBottom = matrix.length - 1;
        
        //Find row where the target might be present
        int ansRow = -1;
        while(rowTop <= rowBottom){
            int mid = (rowTop + rowBottom) / 2;
            if(matrix[mid][0] <= target && target <= matrix[mid][col - 1]){
                ansRow = mid;
                break;
            }
            else if(target > matrix[mid][col - 1]){
                rowTop = mid + 1;
            }
            else{
                rowBottom = mid - 1;
            }
        }
        if(ansRow == -1) return false; 
        
        //Find whether the target is present in the row which is found above
        int left = 0, right = col - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(matrix[ansRow][mid] == target) return true;
            else if(matrix[ansRow][mid] < target) left = mid + 1;
            else{
                right = mid - 1;
            }
        }
        return false;
    }
}

//Time Complexity is O(logM * logN), where M is number of rows and N is number of columns
//Space Complexity is O(1)