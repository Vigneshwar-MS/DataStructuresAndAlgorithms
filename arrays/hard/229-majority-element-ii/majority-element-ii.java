class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        int len = nums.length;
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < len; i++){
            if(ans.size() == 0 || ans.get(0) != nums[i]){
                int count = 0;
                for(int j = 0; j < len; j++){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
                if(count > len / 3){
                    ans.add(nums[i]);
                }
            }
            
            if(ans.size() == 2){
                break;
            }
        }

        return ans;
    }
}