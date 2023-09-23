class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] >= target){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}

//Time complexity is O(log N)
//Space complexity is O(1)