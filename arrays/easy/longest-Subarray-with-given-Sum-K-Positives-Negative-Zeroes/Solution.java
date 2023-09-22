class Solution {


    public static int lenOfLongSubarr (int A[], int N, int K) {

        //This approach is used only if elements in the array has positive, negatives and zeros
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,0);
        int sum = 0;

        for(int i = 0; i < N; i++){
            sum += A[i];
            if(sum == K) max = Math.max(max, i + 1);

            int diff = sum - K;
            if(map.containsKey(diff)){
                max = Math.max(max, i - map.get(diff));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getLongestSubarrayWithOnlyPositiveElements(new int[]{-1, 1, 1}, 1));
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(1)