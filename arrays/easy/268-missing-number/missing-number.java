class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;

        int expectedSum = 0, actualSum = 0;

        for(int i = 0; i <= len; i++){
            expectedSum += i;
        }

        for(int i = 0; i < len; i++){
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
    }
}

//Time Complexity is O(2N)
//Space Complexity is O(1)