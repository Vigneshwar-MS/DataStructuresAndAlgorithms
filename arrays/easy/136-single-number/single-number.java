class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;

        for(int i = 0; i < len; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0 ) + 1);
        }

        for(Map.Entry<Integer, Integer> m :map.entrySet()){
            if(m.getValue() == 1) return m.getKey();
        }

        return -1;
    }
}

//Time complexity is O(NlogM) + O(M), where M = N/2 and M is size of map
//Space complexity is O(M)