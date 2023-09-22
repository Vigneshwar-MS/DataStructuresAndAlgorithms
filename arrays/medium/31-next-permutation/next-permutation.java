class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length, index = -1;
        for(int i = len - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            sort(nums, 0, len - 1);
            return;
        }
        else{
            findNextLargestToRightOfIndex(nums, index);
            sort(nums, index + 1, len - 1);
        }
    }

    static void findNextLargestToRightOfIndex(int[] nums, int index){
        
        for(int i = nums.length - 1; i > index; i--){
            if(nums[i] > nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
    }

    static void sort(int[] nums, int left, int right){
        
        while(left < right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}

//Time complexity is O(3N) ~ O(N)
//Space complexity is O(1))