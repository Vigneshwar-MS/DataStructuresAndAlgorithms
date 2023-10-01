class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int len = nums.length;
        int[] leftProd = new int[len];
        int[] rightProd = new int[len];
        int[] ans = new int[len];
        leftProd[0] = 1;
        rightProd[len - 1] = 1;
        
        int prev = 1;
        for(int i = 0; i < len; i++){
            leftProd[i] = prev;
            ans[i] = prev;
            prev *= nums[i];
        }

        int next = 1;
        for(int i = len - 1; i >= 0; i--){
            rightProd[i] = next;
            ans[i] *= next;
            next *= nums[i];
        }

        return ans;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(N)