class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        if(len == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[len - 1] != nums[len - 2]) return nums[len - 1];

        int left = 1, right = nums.length - 2;
        while(left <= right){
            int mid = (left + right) / 2;
            if(mid != 0 && nums[mid - 1] != nums[mid] && nums[mid + 1] != nums[mid]){
                return nums[mid];
            }
            if(mid % 2 == 1){
                if(nums[mid] == nums[mid - 1]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            else{
                if(nums[mid] == nums[mid + 1]){
                    left = mid + 2;
                }
                else{
                    right = mid - 2;
                }
            }
        }
        return -1;
    }
}