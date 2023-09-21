class Solution {
    public void moveZeroes(int[] nums) {
        int k = -1, len = nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] != 0) nums[++k] = nums[i];
        }

        for(int i = k + 1; i < len; i++){
            nums[i] = 0;
        }
    }
}