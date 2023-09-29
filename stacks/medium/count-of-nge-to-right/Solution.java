class Solution {


    public static int[] countGreater(int []arr, int []query) {
        int[] ans = new int[query.length];
        for(int i = 0; i < query.length; i++){
            int sum = 0;
            for(int j = query[i] + 1; j < arr.length; j++){
                if(arr[j] > arr[query[i]]){
                    sum++;
                }
            }
            ans[i] = sum;
        }

        return ans;
    }

}

//Time Complexity is ~ O(N*Q), where N is the length of array and Q is length of query array
//Space Complexity is ~ O(1)