class Solution {
    public int majorityElement(int[] nums) {

        int maxCount = 0, maxValue = Integer.MIN_VALUE, len = nums.length;
        for(int i = 0; i < len; i++){
            int count = 0;
            for(int j = i; j < len; j++){
                if(nums[j] == nums[i]){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                maxValue = nums[i];
            }
        }   
        if(maxCount > len / 2){
            return maxValue;
        }
        return -1;
    }
}

//Time Complexity is O(N^2)
//Space Complexity is O(1)