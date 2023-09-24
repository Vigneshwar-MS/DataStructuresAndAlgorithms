class Solution {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/aggressive-cows/0
//    Tag - Binary Search Medium level

    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int max = Integer.MIN_VALUE, len = stalls.length;
        int ans = -1;

        for(int i = 0; i < len; i++){
            max = Math.max(max, stalls[i]);
        }


        int low = 1, high = max;
        while(low <= high){
            int dist = (low + high) / 2;
            if(allocateCows(stalls, dist, k)){
                ans = dist;
                low = dist + 1;
            }
            else{
                high = dist - 1;
            }
        }
        return ans;
    }

    static boolean allocateCows(int[] stalls, int dist, int cows){
        int noOfCows = 1, curr = 0;

        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - stalls[curr] >= dist){
                noOfCows++;
                curr = i;
            }
            if(cows == noOfCows) break;
        }

        return cows == noOfCows;
    }

    public static void main(String[] args) {

        int[] arr1 = {10, 1, 2, 7, 5};
        System.out.println(solve(5, 3, arr1));
    }
}

//Time Complexity is O(NlogN) + O(N * log(max-min)), where max is maximum and minimum in the stalls
//Space complexity is O(1)
