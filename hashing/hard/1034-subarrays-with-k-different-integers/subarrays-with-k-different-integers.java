class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return findSubArraysCount(nums, k) - findSubArraysCount(nums, k - 1);
    }

    static int findSubArraysCount(int[] nums, int K){
        int count = 0, left = 0, len = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < len; i++){
            
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            
            while(map.size() > K){
                
                map.put(nums[left], map.getOrDefault(nums[left], 0) - 1);
                if(map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
            }
            count += i - left + 1;
        }
        return count;
    }

}
//Time Complexity is O(N)
//Space Complexity is O(N)