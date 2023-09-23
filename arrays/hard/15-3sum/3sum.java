class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(i != 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = len - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right]));
                    temp.sort(null);
                    ans.add(temp);
                    left++;
                    right--;
                    while(left < len && nums[left] == nums[left - 1]) left++;
                    while(right > left && nums[right] == nums[right + 1]) right--;
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>(ans);
        return res;
        
    }
}

//Time complexity is O(N logN) + O(N^2)
//Space complexity is O(Number of tripletes)