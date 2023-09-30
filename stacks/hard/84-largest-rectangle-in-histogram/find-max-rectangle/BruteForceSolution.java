class BruteForce {

//    Source of the problem - https://leetcode.com/problems/largest-rectangle-in-histogram/description/
//    Tag - Stack Hard level


    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        for(int i = 0; i < n; i++){
            int minHeight = Integer.MAX_VALUE;
            for(int j = i; j < n; j++){
                minHeight = Math.min(minHeight, heights[j]);
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;
    }

}

//Time Complexity is O(N)
//Space complexity is O(N)
