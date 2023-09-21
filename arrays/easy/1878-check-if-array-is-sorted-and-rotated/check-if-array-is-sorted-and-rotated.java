class Solution {
    
    public boolean check(int[] nums) {
        int len = nums.length;
        int count = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] > nums[(i + 1) % len]){
                count++;
            }
            if(count > 1) return false;
        }
        
        return true;   
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(1)