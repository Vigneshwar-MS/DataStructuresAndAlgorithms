class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;

        for(int i = 0; i <= len; i++){
            boolean found = false;
            for(int j = 0; j < len; j++){
                if(i == nums[j]){
                    found = true;
                    break;
                } 
            }
            if(!found) return i;
        }
        return -1;
    }
}