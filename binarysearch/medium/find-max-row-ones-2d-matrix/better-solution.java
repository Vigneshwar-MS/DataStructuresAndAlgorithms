class BruteForce {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1
//    Tag - Matrix Medium level


    int rowWithMax1s(int arr[][], int n, int m) {
        int max = Integer.MIN_VALUE, maxRow = -1;

        for(int i = 0; i < n; i++){
            int index = binarySearch(arr, i, m);
            if(index != -1){
                if(m - index > max){
                    maxRow = i;
                    max = m - index;
                }
            }
        }

        return maxRow;
    }

    int binarySearch(int arr[][], int row, int m){
        int index = -1;
        int left = 0, right = m - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[row][mid] == 1){
                index = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return index;
    }
}

//Time Complexity is O(N*MlogM)
//Space complexity is O(1)
