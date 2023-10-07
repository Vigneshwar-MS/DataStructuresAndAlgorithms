class Solution {
    public int longestConsecutive(int[] nums) {
        int maxCount = -1, len = nums.length;

        if(len == 0) return 0;
        if(len == 1) return 1;
        
        Arrays.sort(nums);
        
        int count = 1;
        for(int i = 1; i < len; i++){
            
            if(nums[i] == nums[i - 1]){
                continue;
            }
            else if(nums[i] == nums[i - 1] + 1){
                count++;
            }
            else{
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }

        return count > maxCount ? count : maxCount;
        
    }
}

//Time Complexity is O(NlogN) 
//Space Complexity is O(1)