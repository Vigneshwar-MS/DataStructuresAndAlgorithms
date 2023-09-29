class Solution {
    
    
    public long subArrayRanges(int[] nums) {
        long ans = 0;
        
        for(int i = 0; i < nums.length; i++){
            long min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for(int j = i; j < nums.length; j++){
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                ans += max - min;
            }
        }
        return ans;
    }
    
}

//Time Complexity is O(N*N)
//Space Complexity is O(1)
