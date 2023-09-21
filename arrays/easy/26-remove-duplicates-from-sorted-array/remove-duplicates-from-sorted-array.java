class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0, len = nums.length;
        
        for(int i = 1; i < len; i++){
            if(nums[i] != nums[i - 1]) nums[++k] = nums[i];
        }
        return k + 1;
    }
}