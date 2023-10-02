class Solution {
    public int longestOnes(int[] nums, int k) {
        int[] map = new int[2];
        int res = 0;
        int left = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            map[nums[i]]++;
            int max = Math.max(map[0], map[1]);

            while( (i - left + 1) - map[1] > k){
                map[nums[left]]--;
                left++;
            }

            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(1)