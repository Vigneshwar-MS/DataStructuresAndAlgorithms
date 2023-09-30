class Solution {

    //    Source of the problem - https://practice.geeksforgeeks.org/problems/the-celebrity-problem/0
    //    Tag - Stack Hard level

    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {

        for(int i = 0; i < n; i++){
            boolean found = true;
            for(int j = 0; j < n; j++){
                if(M[i][j] == 1){
                    found = false;
                }
            }

            for(int j = 0; j < n; j++){
                if(i != j && M[j][i] == 0){
                    found = false;
                }
            }

            if(found){
                return i;
            }
        }

        return -1;
    }
}

//Time Complexity is ~ O(N*N)
//Space Complexity is ~ O(1)