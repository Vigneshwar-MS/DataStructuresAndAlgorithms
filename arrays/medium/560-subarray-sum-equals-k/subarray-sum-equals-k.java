class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            count += map.getOrDefault(sum - k, 0);
            map.put(sum , map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(N)