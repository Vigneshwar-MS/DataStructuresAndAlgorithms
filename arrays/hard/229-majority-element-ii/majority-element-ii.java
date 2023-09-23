class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = Integer.MIN_VALUE, ele1Cnt = 0;
        int ele2 = Integer.MIN_VALUE, ele2Cnt = 0;
        int len = nums.length;
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < len; i++){
            if(ele1Cnt == 0 && nums[i] != ele2){
                ele1 = nums[i];
                ele1Cnt++;
            }
            else if(ele2Cnt == 0 && nums[i] != ele1){
                ele2 = nums[i];
                ele2Cnt++;
            }
            else if(nums[i] == ele1){
                ele1Cnt++;
            }
            else if(nums[i] == ele2){
                ele2Cnt++;
            }
            else{
                ele1Cnt--;
                ele2Cnt--;
            }
        }
        if(checkMajority(nums, ele1)) ans.add(ele1);
        if(checkMajority(nums, ele2)) ans.add(ele2);
        return ans;
    }

    static boolean checkMajority(int[] nums, int val){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                count++;
            }
        }
        if(count > (nums.length / 3 )){
            return true;
        }
        else{
            return false;
        }
    }
}

//Time Complexity is O(N)
//Space Complexity is O(1)