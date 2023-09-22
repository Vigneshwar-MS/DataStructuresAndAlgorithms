class Solution {
    public int longestConsecutive(int[] nums) {
        int maxCount = -1, len = nums.length;

        if(len == 0) return 0;
        if(len == 1) return 1;
        
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < len; i++){
            set.add(nums[i]);
        }

        for(int i = 0; i < len; i++){
            if(!set.contains(nums[i] - 1)){
                int count = 0;
                int start = nums[i];
                while(set.contains(start)){
                    count++;
                    start++;
                }
                maxCount = Math.max(count, maxCount);
            }
        }
        return maxCount;
    }
}

//Time Complexity is O(3N) ~ O(N)
//Space Complexity is O(N) for the set