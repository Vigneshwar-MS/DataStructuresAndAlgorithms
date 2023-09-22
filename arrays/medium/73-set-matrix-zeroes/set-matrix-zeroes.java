class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] rowmat = new int[row];
        int[] colmat = new int[col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == 0){
                    rowmat[i] = 1;
                    colmat[j] = 1;
                }
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(rowmat[i] == 1 || colmat[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    
}