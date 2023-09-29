class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int ans = 0;

        int[] leftMax = new int[len];
        int val1 = Integer.MIN_VALUE;
        for(int j = 0; j < len; j++){
            val1 = Math.max(val1, height[j]);
            leftMax[j] = val1;
        }

        int[] rightMax = new int[len];
        int val2 = Integer.MIN_VALUE;
        for(int k = len - 1; k >= 0; k--){
            val2 = Math.max(val2, height[k]);
            rightMax[k] = val2;
        }

        for(int i = 0; i < len; i++){
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }
}

//Time Complexity is O(3N) ~ O(N), where N is length of height array
//Space Complexity is O(2N) ~ O(N)
