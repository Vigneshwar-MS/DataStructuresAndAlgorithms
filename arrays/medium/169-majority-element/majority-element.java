class Solution {
    public int majorityElement(int[] nums) {

        int maxCount = 0, maxValue = 0, len = nums.length;
        for(int i = 0; i < len; i++){
            if(maxCount == 0){
                maxValue = nums[i];
                maxCount++;
            }
            else if(nums[i] == maxValue){
                maxCount++;
            }
            else{
                maxCount--;
            }
        }
        
        int ans = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] == maxValue){
                ans++;
            }
        }

        //This is to verify if the value that we have got is the majority
        if(ans > len / 2){
            return maxValue;
        }
        return -1;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(1)