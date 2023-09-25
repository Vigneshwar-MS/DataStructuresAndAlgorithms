class BruteForce {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/1
//    Tag - Hashing Medium level

    static int maxLen(int[] arr, int N)
    {
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for(int i = 0; i < N; i++){
            arr[i] = arr[i] == 0 ? -1 : 1;
        }

        for(int i = 0; i < N; i++){
            sum += arr[i];

            if(sum == 0) max = Math.max(max, i + 1);

            if(map.containsKey(sum)){
                max = Math.max(max, i - map.get(sum));
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }

    public static void main(String[] args) {

        int[] A = {0,1,0,1};
        System.out.println(maxLen(A, 4));
    }
}

//Time Complexity is O(N)
//Space complexity is O(N)
