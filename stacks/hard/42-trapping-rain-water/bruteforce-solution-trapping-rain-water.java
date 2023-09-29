class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int ans = 0;
        for(int i = 0; i < len; i++){
            int val1 = Integer.MIN_VALUE;
            for(int j = i; j >= 0; j--){
                val1 = Math.max(val1, height[j]);
            }

            int val2 = Integer.MIN_VALUE;
            for(int k = i; k < len; k++){
                val2 = Math.max(val2, height[k]);
            }

            ans += Math.min(val1, val2) - height[i];
        }
        return ans;
    }
}

//Time Complexity is O(N*N), where N is length of height array
//Space Complexity is O(1),
