class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(len == 1) return;

        k = k % len;
        
        int left = len - k, right = len - 1;
        while(left < right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }

        left = 0; right = len - k - 1;
        while(left < right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }

        left = 0; right = len - 1;
        while(left < right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}