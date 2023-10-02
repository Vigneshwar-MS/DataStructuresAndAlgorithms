class BruteForce {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1
//    Tag - Matrix Medium level


    int rowWithMax1s(int arr[][], int n, int m) {
        int max = Integer.MIN_VALUE, maxRow = -1;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){
                if(arr[i][j] == 1){
                    if(m - j > max){
                        max = m - j;
                        maxRow = i;
                    }
                    break;
                }
            }
        }

        return maxRow;
    }
}

//Time Complexity is O(N*M)
//Space complexity is O(1)
