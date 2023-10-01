class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int len = nums.length;
        int[] leftProd = new int[len];
        int[] rightProd = new int[len];
        int[] ans = new int[len];
        leftProd[0] = 1;
        rightProd[len - 1] = 1;
        
        int prev = 1;
        for(int i = 1; i < len; i++){
            leftProd[i] = prev * nums[i - 1];
            prev = leftProd[i];
        }

        prev = 1;
        for(int i = len - 2; i >= 0; i--){
            rightProd[i] = prev * nums[i + 1];
            prev = rightProd[i];
        }

        for(int i = 0; i < len; i++){
            ans[i] = leftProd[i] * rightProd[i];
        }

        return ans;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(N)