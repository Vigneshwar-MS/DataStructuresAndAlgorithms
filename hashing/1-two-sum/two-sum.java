class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < len; i++){
            
            int secondVal = target - nums[i];
            
            if(map.containsKey(secondVal)) return new int[]{map.get(secondVal), i};
            
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}

//Time complexity is O(N)
//Space complexity is O(N)