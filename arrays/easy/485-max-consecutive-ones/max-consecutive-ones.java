class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0, len = nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] == 0){
                maxCount = Math.max(count, maxCount);
                count = 0;
            }else{
                count++;
            }
        }
        return Math.max(count,maxCount);
    }
}