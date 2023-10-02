class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rowLength = matrix.length, colLength = matrix[0].length;
        int row = 0, col = colLength - 1;
    

        while(row < rowLength && col >= 0){
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) row++;
            else{
                col--;
            }
        }
        return false;
    }
}

//Time Complexity is O(M + N), where M is number of rows and N is number of columns
//Space Complexity is O(1)