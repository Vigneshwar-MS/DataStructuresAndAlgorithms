class Solution {


    public static int getLongestSubarrayWithOnlyPositiveElements(int[] a, int k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0;
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(getLongestSubarrayWithOnlyPositiveElements(new int[]{2, 3, 5, 1, 9}, 10));
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(1)
