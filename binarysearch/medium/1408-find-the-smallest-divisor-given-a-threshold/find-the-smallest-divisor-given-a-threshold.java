class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE, len = nums.length;
        int ans = -1;

        for(int i = 0; i < len; i++){
            max = Math.max(max, nums[i]);
        }

        int low = 1, high = max;
        while(low <= high){
            int mid = (low + high) / 2;
            if(isItDivisible(nums, threshold, mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    static boolean isItDivisible(int[] nums, int threshold, int divisor){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += Math.ceil((double) nums[i] / (double) divisor);
        }
        return sum <= threshold;
    }
}

//Time Complexity is O(N * log(Max-Min)), where Max - maximum element, Min is minimum element in the array and N is length of array
//Space complexity is O(1)