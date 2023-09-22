class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i < m; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < m; i++){
            reverse(matrix, i, n);
        }
    }

    static void reverse(int[][] matrix, int row, int col){
        int left = 0, right = col - 1;
        while(left < right){
            int temp = matrix[row][left];
            matrix[row][left] = matrix[row][right];
            matrix[row][right] = temp;
            left++;
            right--;
        }
    }
}