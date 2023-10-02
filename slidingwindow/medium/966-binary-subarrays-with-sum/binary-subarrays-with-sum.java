class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0, len = nums.length, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i = 0; i < len; i++){
            sum += nums[i];
            int diff = sum - goal;
            count += map.getOrDefault(diff, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

}