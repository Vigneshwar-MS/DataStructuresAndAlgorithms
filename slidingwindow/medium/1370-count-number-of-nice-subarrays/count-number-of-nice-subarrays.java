class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int sum = 0, count = 0, len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < len; i++){
            nums[i] = nums[i] % 2 == 1 ? 1 : 0;
        }

        map.put(0, 1);
        for(int i = 0; i < len; i++){
            sum += nums[i];
            
            int diff = sum - k;

            count += map.getOrDefault(diff, 0);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
            
        }

        return count;
        
    }
}

//Time Complexity is O(N)
//Space Complexity is O(N)