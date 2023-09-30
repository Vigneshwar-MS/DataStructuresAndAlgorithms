class Solution {

    //    Source of the problem - https://practice.geeksforgeeks.org/problems/the-celebrity-problem/0
    //    Tag - Stack Hard level

    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        // 	for(int i = 0, j = n - 1; i < n && j >= 0; i++)
        int i = 0, j = n - 1;
        while(i < j){
            if(M[i][j] == 1){
                i++;
            }
            else{
                j--;
            }
        }

        for(int col = 0; col < n; col++){
            if(M[i][col] == 1){
                return -1;
            }
        }

        for(int row = 0; row < n; row++){
            if(row != j && M[row][j] == 0){
                return -1;
            }
        }

        return i;
    }

}

//Time Complexity is ~ O(N), where N is the length of array
//Space Complexity is ~ O(1)