class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0, neg = 1;
        int[] ans = nums.clone();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos = pos + 2;
            }else if(nums[i] < 0){
                ans[neg] = nums[i];
                neg = neg + 2;
            }
        }
        return ans;
    }
}