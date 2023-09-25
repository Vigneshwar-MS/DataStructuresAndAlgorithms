class BruteForce {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/1
//    Tag - Arrays Medium level


    static int maxLen(int[] arr, int N)
    {
        int max = 0;
        for(int i = 0; i < N; i++){
            int[] map = new int[2];

            for(int j = i; j < N; j++){
                map[arr[j]]++;
                if(map[0] == map[1]){
                    max = Math.max(j - i + 1, max);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] A = {0,1,0,1};
        System.out.println(maxLen(A, 4));
    }
}

//Time Complexity is O(N*N)
//Space complexity is O(1)
