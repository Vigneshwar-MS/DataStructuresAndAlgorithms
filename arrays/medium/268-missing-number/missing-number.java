class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < len; i++){
            set.add(nums[i]);
        }

        for(int i = 0; i <= len; i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return -1;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(N)