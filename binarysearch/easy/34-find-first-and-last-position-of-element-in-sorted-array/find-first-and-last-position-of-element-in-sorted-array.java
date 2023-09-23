class Solution {
    public int[] searchRange(int[] nums, int target) {

        int firstIndex = findFirstOccurrence(nums, target);
        if(firstIndex == -1){
            return new int[]{-1, -1};
        }
        int lastIndex = findLastOccurrence(nums, target);              
        return new int[]{firstIndex, lastIndex};
    }

    static int findFirstOccurrence(int[] nums, int target){
        int left = 0, right = nums.length - 1, ans = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                ans = mid;
                right = mid - 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }

    static int findLastOccurrence(int[] nums, int target){
        int left = 0, right = nums.length - 1, ans = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                ans = mid;
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}