class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int M = mat.length, N = mat[0].length;

        
        int low = 0, high = N - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            int maxRow = findMaxInColumn(mat, M, mid);
            int left = mid - 1 >= 0 ? mat[maxRow][mid - 1] : -1;
            int right = mid + 1 < N ? mat[maxRow][mid + 1] : -1;

            if(mat[maxRow][mid] > left && mat[maxRow][mid] > right){
                return new int[]{maxRow, mid};
            }
            else if(mat[maxRow][mid] < left ) high = mid - 1;
            else {
                low = mid + 1;
            }
        }
        
        return new int[]{-1, -1};
    }

    int findMaxInColumn(int[][] mat, int M, int col){
        int maxValue = Integer.MIN_VALUE, maxRow = -1;
        for(int i = 0; i < M; i++){
            if(mat[i][col] > maxValue){
                maxValue = mat[i][col];
                maxRow = i;
            }
        }
        return maxRow;
    }
}
//Time Complexity is O(M log N)
//Space complexity is O(1)