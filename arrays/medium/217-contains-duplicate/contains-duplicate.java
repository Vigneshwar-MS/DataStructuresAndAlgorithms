class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int val : nums){
            if(set.contains(val)) return true;
            set.add(val);
        }
        return false;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(N)