class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

         List<List<Integer>> ans = new ArrayList<>();
         int len = nums.length;
         for(int i = 0; i < len; i++){
             if(i > 0 && nums[i] == nums[i - 1]){
                 continue;
             }
             for(int j = i + 1; j < len; j++){
                 if( j > i + 1 && nums[j] == nums[j - 1] ){
                     continue;
                 }

                 int left = j + 1, right = len - 1;
                 while(left < right){
                     long sum = nums[i];
                     sum += nums[j];
                     sum += nums[left];
                     sum += nums[right];
                     if(sum == target){
                         List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                         ans.add(temp);
                         left++;
                         right--;
                         while(left < right && nums[left] == nums[left - 1]) left++;
                         while(right > left && nums[right] == nums[right + 1]) right--;
                     }
                     else if(sum < target){
                         left++;
                     }
                     else{
                         right--;
                     }
                 }
             }
         }
         return ans;
    }
}

//Time Complexity is O(N^3)
//Space Complexity is O(Number of quadruplets)