class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int ans = 0;

        int leftMax = 0, rightMax = 0;
        int left = 0, right = len - 1;
        while(left <= right){
            
            if(height[left] <= height[right]){

                if(height[left] < leftMax){
                    ans += Math.min(height[right], leftMax) - height[left];
                }
                else{
                    leftMax = height[left];
                }
                left++;
            }
            else{
                if(height[right] < rightMax){
                    ans += Math.min(rightMax, height[left]) - height[right];
                }
                else{
                    rightMax = height[right];
                }
                right--;
            }
        }
        return ans;
    }
}

//Time Complexity is O(N), where N is length of height array
//Space Complexity is O(1)
